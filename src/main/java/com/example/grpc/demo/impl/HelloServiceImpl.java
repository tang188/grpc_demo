package com.example.grpc.demo.impl;

import com.example.grpc.demo.service.MyServiceGrpc;
import com.example.grpc.demo.hello.HelloRequest;
import com.example.grpc.demo.hello.HelloResponse;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: Malphite
 * @date: 2021/10/18 11:30 上午
 * @version: 1.0
 * @group:
 */
@Slf4j
public class HelloServiceImpl extends MyServiceGrpc.MyServiceImplBase {

    @Override
    public void sayHi(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        log.error("request.getName: " + request.getName());
        HelloResponse.Builder builder = HelloResponse.newBuilder();

        builder.setName(request.getName());
        builder.setCode(200);
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }


}
