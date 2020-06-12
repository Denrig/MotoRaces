import app.Network.gRPC.GrpcServer;

public class START_GRPC_SERVER {

    public static void main(String[] args) throws Exception {
        GrpcServer server = new GrpcServer(5556);
        server.start();
        server.blockUntilShutdown();
    }
}
