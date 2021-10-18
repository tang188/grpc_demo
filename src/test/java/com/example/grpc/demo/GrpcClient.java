package com.example.grpc.demo;

import com.example.grpc.demo.service.MyServiceGrpc;
import com.example.grpc.demo.hello.HelloRequest;
import com.example.grpc.demo.hello.HelloResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @author: Malphite
 * @date: 2021/10/18 2:52 下午
 * @version: 1.0
 * @group:
 */
@Slf4j
public class GrpcClient {

    private final MyServiceGrpc.MyServiceBlockingStub blockingStub;

    public GrpcClient(ManagedChannel channel) {
        blockingStub = MyServiceGrpc.newBlockingStub(channel);
    }

    public void sayHi(String name) {
        HelloRequest request = HelloRequest.newBuilder().setName(name).build();
        HelloResponse response = blockingStub.sayHi(request);
        log.info("grpc response: {}-{}", response.getCode(), response.getName());
    }

    public static void main(String[] args) throws InterruptedException {
        String target = "127.0.0.1:50001";
        if (args.length > 0) {
            if ("--help".equals(args[0])) {
                System.err.println("Usage: [name [target]]");
                System.err.println("");
                System.err.println("  target  The server to connect to. Defaults to " + target);
                System.exit(1);
            }
        }
        if (args.length > 1) {
            target = args[1];
        }

        ManagedChannel channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();

        try {
            GrpcClient client = new GrpcClient(channel);
            client.sayHi("tangzhihong");
        }finally {
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }
    }
}
