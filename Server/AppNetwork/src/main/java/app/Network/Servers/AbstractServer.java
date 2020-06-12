package app.Network.Servers;

import app.Services.AppException;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public abstract class AbstractServer {
    private int port;
    private ServerSocket server=null;

    public AbstractServer(int port){this.port=port;}

    public void start() throws AppException {
        try {
            server=new ServerSocket(port);
            while (true){
                Socket client=server.accept();
                pocessRequest(client);
            }
        } catch (IOException e) {
            throw new AppException("STARTING SERVER ERROR");
        }
        finally {
            stop();
        }
    }

    public void stop() throws AppException {
        try {
            server.close();
        } catch (IOException e) {
            throw new AppException("Closing server error ", e);
        }
    }

    protected abstract void pocessRequest(Socket client);
}
