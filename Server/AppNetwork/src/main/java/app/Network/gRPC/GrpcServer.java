package app.Network.gRPC;

import app.Repository.RaceDBRepository;
import app.Repository.RacerDBRepository;
import app.Repository.UserRepository;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class GrpcServer {
    private static final org.apache.logging.log4j.core.Logger logger= (Logger) LogManager.getLogger("com");
    private final int port;
    private final Server server;

    public GrpcServer(int port) {
        this.port = port;
        ApplicationContext context=new ClassPathXmlApplicationContext("BeansServer.xml");
        //Creates a server using the beans
        server= ServerBuilder.forPort(port).addService(new IServiceGrpcImpl(context.getBean(UserRepository.class),context.getBean(RaceDBRepository.class),context.getBean(RacerDBRepository.class))).build();
    }
    public void start() throws IOException{
        server.start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                logger.error("*** shutting down gRPC server since JVM is shutting down");
                try {
                    GrpcServer.this.stop();
                } catch (InterruptedException e) {
                    e.printStackTrace(System.err);
                }
                logger.error("*** server shut down");
            }
        });

    }
    public void stop() throws InterruptedException {
        logger.info("Server stopping....");
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
}


}
