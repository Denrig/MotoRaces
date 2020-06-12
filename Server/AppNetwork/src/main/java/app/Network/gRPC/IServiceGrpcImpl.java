package app.Network.gRPC;

import app.Domain.User;
import app.Repository.RaceDBRepository;
import app.Repository.RacerDBRepository;
import app.Repository.UserRepository;
import app.Services.AppException;
import io.grpc.stub.StreamObserver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.time.LocalDate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class IServiceGrpcImpl extends IServiceGrpc.IServiceImplBase {

    private static final Logger logger= (Logger) LogManager.getLogger("com");
    private UserRepository userRepository;
    private RaceDBRepository raceDBRepository;
    private RacerDBRepository racerDBRepository;
    private Map<String, StreamObserver<Response>> loggedClients;

    public IServiceGrpcImpl(UserRepository userRepository, RaceDBRepository raceDBRepository, RacerDBRepository racerDBRepository) {
        this.userRepository = userRepository;
        this.raceDBRepository = raceDBRepository;
        this.racerDBRepository = racerDBRepository;
        this.loggedClients=new ConcurrentHashMap<>();
    }
    //HANDEL LOGIN REQUEST FROM CLIENT
    @Override
    public void login(LogRequest request,StreamObserver<Response> responseObserver) {
            logger.info("Got LOGIN Request from user: "+request.getUser());
        if(userRepository.login(new User(request.getUser(),request.getPass()))!=null){
            if(loggedClients.get(request.getUser())!=null)
            {logger.error("User already logged in.");
                responseObserver.onError(new AppException("User already logged in."));}
            else {
                responseObserver.onNext(Response.newBuilder().setType(Response.Type.ok).build());
                responseObserver.onCompleted();
            }
        }
        else
        {logger.error("Login failed");
            responseObserver.onError(new AppException("Login failed"));
        }

    }
    //HANDEL LOGOUT REQUEST FROM CLIENT
    @Override
    public void logout(LogRequest request, StreamObserver<Response> responseObserver) {
        logger.info("Got LOGOUT Request from user: "+request.getUser());
        StreamObserver<Response> localClient= loggedClients.remove(request.getUser());
        if (localClient == null)
        {logger.error("User "+request.getUser()+" is not logged in.");
            responseObserver.onError(new AppException("User "+request.getUser()+" is not logged in."));
        }
        responseObserver.onCompleted();
        localClient.onCompleted();
        logger.traceExit();
    }
    //HANDLE MULTIPLE TYPES OF REQUEST FROM CLIENT
    //TYPE INIT: SAVES THE USER:STREAM_OBSERVER IN THE loggedClients
    //TYPE ADD: IF REQUEST VALID SAVES THE RACER FROM DB AND SENDS NOTIFICATION TO ALL ACTIVE CLIENTS
    //TYPE DELETE:IF REQUEST VALID DELETS THE RACER FROM DB AND SENDS NOTIFICATION TO ALL ACTIVE CLIENTS
    @Override
    public StreamObserver<Request> makeCall(StreamObserver<Response> responseObserver) {
        return new StreamObserver<Request>() {
            @Override
            public void onNext(Request value) {
                Response response= Response.newBuilder().build();
                switch (value.getType()){
                    case init:
                        logger.info("Initialize connection with client...");
                        loggedClients.put(value.getUser(),responseObserver);
                        responseObserver.onNext(Response.newBuilder().setType(Response.Type.ok).build());
                        break;
                    case add:
                        logger.info("Request received Type: "+value.getType().toString());
                        response=addRacer(value);
                        break;
                    case delete:
                        logger.info("Request received Type: "+value.getType().toString());
                        response=deleteRacer(value);
                        break;
                    case UNRECOGNIZED:
                        logger.error("Unknown Request");
                        responseObserver.onError(new AppException("Unknown Request"));
                        break;
                }
                if(response.getType()== Response.Type.add||response.getType()== Response.Type.delete)
                {  logger.info("Sending update:"+response.getType().toString()+"to all active clients.....");
                    for(StreamObserver<Response> observer:loggedClients.values())
                    observer.onNext(response);}

            }

            @Override
            public void onError(Throwable t) {
                logger.error("Client error: "+t.getMessage());
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                logger.error("Client connection TERMINATED!!!");
                responseObserver.onCompleted();
            }
        };
    }

    //SEND ON THE STREAM ALL THE RACES AVAILABLE IN THE DATABASE
    @Override
    public void getAvailableRaces(GetRaces request, StreamObserver<Race> responseObserver) {
        logger.traceEntry();
        if(raceDBRepository!=null)
        {logger.traceExit();
            for(app.Domain.Race race : raceDBRepository.findAll()){
                responseObserver.onNext(Race.newBuilder().setDate(race.getDate().toString()).
                        setEngine(Engine.valueOf(race.getEngine().toString())).setId(race.getId()).setNoRacers(race.getNoRacers()).build());

            }
        }
        else
        { logger.error("Data unavailable");
            responseObserver.onError( new AppException("Data unavailable"));
        }

        responseObserver.onCompleted();
    }
    //SENDS ON THE STREAM ALL THE RACERS AVAILABLE IN THE DATABASE
    @Override
    public void findAllRacers(GetRacers request, StreamObserver<Racer> responseObserver) {
        logger.traceEntry();
        if(racerDBRepository!=null)
        {logger.traceExit();
            for(app.Domain.Racer racer : racerDBRepository.findAll()){
                responseObserver.onNext(Racer.newBuilder().setId(racer.getId()).setName(racer.getName()).setEngine(Engine.valueOf(racer.getEngine().toString()))
                        .setTeam(Team.valueOf(racer.getTeam().toString())).build());
            }
        }
        else
        {logger.error("Data unavailable");
            responseObserver.onError( new AppException("Data unavailable"));
        }
        responseObserver.onCompleted();
    }


    private Response addRacer(Request request) {
        if(request.getRacer() !=null && request.getRace()!=null){
            app.Domain.Racer racer=new app.Domain.Racer(app.Domain.Team.valueOf(request.getRacer().getTeam().toString()),
                    app.Domain.Engine.valueOf(request.getRacer().getEngine().toString()),request.getRacer().getName());
            app.Domain.Race race=new app.Domain.Race(request.getRace().getId(),app.Domain.Engine.valueOf(request.getRace().getEngine().toString()),
                    LocalDate.parse(request.getRace().getDate()),request.getRace().getNoRacers());


            racer.setId(racerDBRepository.getLastID());
            if(racerDBRepository.save(racer)==null)
            {raceDBRepository.addToRace(racer,race);
                logger.traceExit();
                return Response.newBuilder().setType(Response.Type.add).setRacer(Racer.newBuilder().setId(racer.getId())
                        .setName(request.getRacer().getName()).setEngine(request.getRacer().getEngine()).
                                setTeam(request.getRacer().getTeam()).build()).build();

            }
            else
            {logger.error("Adding racer:"+racer.getName()+" FAILED!!!!"); }
        }
        else
        {logger.error("Null parameter"); }
        return Response.newBuilder().build();
    }
    private Response deleteRacer(Request request) {
        if(request.getRacer()!=null){
            app.Domain.Racer racer1=racerDBRepository.findOne(request.getRacer().getId());
            if(racerDBRepository.delete(request.getRacer().getId())!=null)
                if(true)
                {
                    logger.traceExit();
                    return Response.newBuilder().setType(Response.Type.delete).setRacer(Racer.newBuilder().setId(racer1.getId())
                            .setName(racer1.getName()).setEngine(Engine.valueOf(racer1.getEngine().toString())).
                                    setTeam(Team.valueOf(racer1.getTeam().toString())).build()).build();



                }else
                {logger.error("Deleting racer:"+request.getRacer().getName()+" FAILED!!!!");
                }

        }else {logger.error("Null parameter"); }
        return Response.newBuilder().build();
    }

}
