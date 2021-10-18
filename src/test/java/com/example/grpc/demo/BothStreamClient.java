package com.example.grpc.demo;

import com.example.grpc.demo.service.MyStreamServiceGrpc;
import com.example.grpc.demo.streamHello.StreamRequest;
import com.example.grpc.demo.streamHello.StreamResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: Malphite
 * @date: 2021/10/18 7:52 下午
 * @version: 1.0
 * @group:
 */
@Slf4j
public class BothStreamClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50001)
                .usePlaintext().build();
        MyStreamServiceGrpc.MyStreamServiceStub stub = MyStreamServiceGrpc.newStub(channel);

        log.info("流式请求-流式响应：bothStream");

        StreamObserver<StreamRequest> requestStreamObserver = stub.bothStream(new StreamObserver<StreamResponse>() {
            @Override
            public void onNext(StreamResponse value) {
                log.warn("流式请求-流式响应 response:{} ", value.getData());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                log.info("completed");
            }
        });

        try {
            requestStreamObserver.onNext(StreamRequest.newBuilder().setName("tangzhihong 1号").build());
            Thread.sleep(1000);
            requestStreamObserver.onNext(StreamRequest.newBuilder().setName("tangzhihong 2号").build());
            Thread.sleep(1000);
            requestStreamObserver.onNext(StreamRequest.newBuilder().setName("tangzhihong 3号").build());
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        requestStreamObserver.onCompleted();
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
