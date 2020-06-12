package app.server;

import app.Domain.Race;
import app.Domain.Racer;
import app.Domain.User;
import app.Repository.RaceDBRepository;
import app.Repository.RacerDBRepository;
import app.Repository.UserRepository;
import app.Services.AppException;
import app.Services.IObserver;
import app.Services.IService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.rmi.RemoteException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.StreamSupport;

public class ServiceImpl implements IService {
    private static final Logger logger= (Logger) LogManager.getLogger(ServiceImpl.class.getName());
    private UserRepository userRepository;
    private RaceDBRepository raceDBRepository;
    private RacerDBRepository racerDBRepository;
    private Map<String,IObserver> loggedClients;

    public ServiceImpl(UserRepository userRepository,RacerDBRepository racerDBRepository,RaceDBRepository raceDBRepository){

        this.userRepository=userRepository;
        this.raceDBRepository=raceDBRepository;
        this.racerDBRepository=racerDBRepository;
        this.loggedClients=new ConcurrentHashMap<>();
    }

    @Override
    public synchronized void login(User user, IObserver client) throws AppException {
        logger.traceEntry();
        if(userRepository.login(user)!=null){
            if(loggedClients.get(user.getId())!=null)
            {logger.error("User already logged in.");
                throw  new AppException("User already logged in.");}
            loggedClients.put(user.getId(),client);
        }
        else
        {logger.error("Login failed");
            throw new AppException("Login failed");}
        logger.traceExit();
    }

    @Override
    public synchronized void logout(User user, IObserver client) throws AppException {
        logger.traceEntry();
        IObserver localClient = loggedClients.remove(user.getId());
        if (localClient == null)
        {logger.error("User "+user.getId()+" is not logged in.");
            throw new AppException("User "+user.getId()+" is not logged in.");
        }
        logger.traceExit();
    }

    @Override
    public synchronized Iterable<Race> getAvailableRaces() throws AppException {
        logger.traceEntry();
        if(raceDBRepository!=null)
        {logger.traceExit();
            return raceDBRepository.findAll();}
        else
        { logger.error("Data unavailable");
            throw new AppException("Data unavailable"); }

    }

    @Override
    public Racer addRacer(Racer racer, Race race) throws AppException {
        logger.traceEntry();
        if(racer !=null && race!=null){
            racer.setId(racerDBRepository.getLastID());
            if(racerDBRepository.save(racer)==null)
              {raceDBRepository.addToRace(racer,race);
               addNotifyAll(racer);
               logger.traceExit();
              return racer;
              }
              else
            {logger.error("Adding racer:"+racer.getName()+" FAILED!!!!");
                throw new AppException("Adding racer:"+racer.getName()+" FAILED!!!!");}
        }
        else
        {logger.error("Null parameter");
            throw new AppException("Null parameter");}
    }

    @Override
    public synchronized Racer deleteRacer(Long id) throws AppException {
        logger.traceEntry();
        if(id!=null){
            Racer racer=racerDBRepository.findOne(id);
            if(racerDBRepository.delete(id)!=null){
                deleteNotifyAll(racer);
                logger.traceExit();
                return racer;
            }else
            {logger.error("Deleting racer:"+racer.getName()+" FAILED!!!!");
                throw new AppException("Deleting racer:"+racer.getName()+ "FAILED!!!!");}

        }else {logger.error("Null parameter");
            throw new AppException("Null parameter");}
    }

    @Override
    public synchronized Iterable<Racer> findAllRacers() throws AppException {
       logger.traceEntry();
        if(racerDBRepository!=null)
        {logger.traceExit();
            return racerDBRepository.findAll();}
        else
        {logger.error("Data unavailable");
            throw new AppException("Data unavailable");
        }
    }


    private void addNotifyAll(Racer racer){
        logger.traceEntry();
        loggedClients.values().forEach(x-> {
            try {
                x.racerAdded(racer);
            } catch (AppException | RemoteException e) {
                logger.error(e.getMessage());
            }
        });
        logger.traceExit();
    }

    private void deleteNotifyAll(Racer racer){
        logger.traceEntry();
        loggedClients.values().forEach(x-> {
            try {
                x.racerDeleted(racer);
            } catch (AppException | RemoteException e) {
                logger.error(e.getMessage());
            }
        });
        logger.traceExit();
    }
}
