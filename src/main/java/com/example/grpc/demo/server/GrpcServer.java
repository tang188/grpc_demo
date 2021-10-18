package com.example.grpc.demo.server;

import com.example.grpc.demo.impl.HelloServiceImpl;
import com.example.grpc.demo.impl.StreamServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author: Malphite
 * @date: 2021/10/18 11:55 上午
 * @version: 1.0
 * @group:
 */
@Component
@Slf4j
public class GrpcServer {

    private Server server;

    private final GrpcConfig grpcConfig;

    public GrpcServer(GrpcConfig grpcConfig) {
        this.grpcConfig = grpcConfig;
    }

    /**
     * Main launches the server from the command line.
     */
    public void runForever() throws IOException, InterruptedException {
        start();
        blockUntilShutdown();
    }

    /**
     * Await termination on the main thread since the gRPC library uses daemon threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    @SneakyThrows
    private void start() {
        server = ServerBuilder.forPort(grpcConfig.getPort())
                .addService(new HelloServiceImpl())
                .addService(new StreamServiceImpl())
                .build()
                .start();
        log.info("gRPC Server started, listening on " + grpcConfig.getPort());
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            try {
                GrpcServer.this.stop();
            } catch (InterruptedException e) {
                e.printStackTrace(System.err);
            }
            System.err.println("*** gRPC server shut down");
        }));
    }


    public void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }
}
