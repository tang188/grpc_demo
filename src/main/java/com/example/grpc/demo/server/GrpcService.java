package com.example.grpc.demo.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author: Malphite
 * @date: 2021/10/18 2:39 下午
 * @version: 1.0
 * @group:
 */
@Slf4j
@Component
public class GrpcService {

    private GrpcServer grpcServer;

    @Autowired
    private GrpcConfig grpcConfig;

    /**
     * Auto called by spring Configuration.Bean
     */
    public void startup() {
        try {
            GrpcServer server = new GrpcServer(grpcConfig);
            Thread serviceThread = new Thread(new GrpcServiceThread(server));
            serviceThread.start();
            log.info("game server gRPC service startup success:");
        } catch (Exception e) {
            log.error("game server gRPC service startup error:" + e.getMessage());
        }
    }

    /**
     * Thread of gRPC server for game server
     */
    static class GrpcServiceThread implements Runnable {
        private final GrpcServer grpcServer;

        public GrpcServiceThread(GrpcServer grpcServer) {
            this.grpcServer = grpcServer;
        }

        @Override
        public void run() {
            try {
                this.grpcServer.runForever();
            } catch (Exception e) {
                log.warn("ERR:" + e.getCause());
            }
        }
    }

    @PostConstruct
    public void init(){
        startup();
    }

}
