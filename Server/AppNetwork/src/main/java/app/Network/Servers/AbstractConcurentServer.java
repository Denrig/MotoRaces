package app.Network.Servers;

import java.net.Socket;

public abstract class AbstractConcurentServer extends AbstractServer {
    public AbstractConcurentServer(int port) {
        super(port);
    }

    protected void pocessRequest(Socket client) {
        Thread tw=createWorker(client);
        tw.start();
    }

    protected abstract Thread createWorker(Socket client) ;
}
