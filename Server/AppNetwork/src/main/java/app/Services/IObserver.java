package app.Services;

import app.Domain.Racer;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IObserver extends Remote {
    void racerAdded(Racer racer) throws AppException, RemoteException;
    void racerDeleted(Racer racer)  throws AppException,RemoteException;
}
