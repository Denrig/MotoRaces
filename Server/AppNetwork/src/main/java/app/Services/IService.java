package app.Services;

import app.Domain.Race;
import app.Domain.Racer;
import app.Domain.User;

public interface IService {

    void login(User user, IObserver client)  throws AppException;
    void logout(User user,IObserver client)  throws AppException;

    Iterable<Race> getAvailableRaces()  throws AppException;

    Racer addRacer(Racer racer,Race race) throws AppException;
    Racer deleteRacer(Long id) throws AppException;
    Iterable<Racer> findAllRacers() throws AppException;

}
