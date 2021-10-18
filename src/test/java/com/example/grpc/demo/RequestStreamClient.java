package com.example.grpc.demo;

import com.example.grpc.demo.service.MyStreamServiceGrpc;
import com.example.grpc.demo.streamHello.StreamRequest;
import com.example.grpc.demo.streamHello.StreamResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

import java.util.stream.Stream;

/**
 * @author: Malphite
 * @date: 2021/10/18 7:52 下午
 * @version: 1.0
 * @group:
 */
@Slf4j
public class RequestStreamClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50001)
                .usePlaintext().build();

        log.info("流式请求：responseStream");
        MyStreamServiceGrpc.MyStreamServiceStub blockingStub = MyStreamServiceGrpc.newStub(channel);

        StreamObserver<StreamResponse> responseStreamObserver = new StreamObserver<StreamResponse>() {
            @Override
            public void onNext(StreamResponse value) {
                log.info("response: {}", value.getData());
            }

            @Override
            public void onError(Throwable t) {
                log.error(t.getMessage());
            }

            @Override
            public void onCompleted() {
                log.info("completed");
            }
        };
        StreamObserver<StreamRequest> requestStreamObserver = blockingStub.requestStream(responseStreamObserver);
        requestStreamObserver.onNext(StreamRequest.newBuilder().setName("tangzhihong 1号").build());
        requestStreamObserver.onNext(StreamRequest.newBuilder().setName("tangzhihong 2号").build());
        requestStreamObserver.onNext(StreamRequest.newBuilder().setName("tangzhihong 3号").build());
        requestStreamObserver.onCompleted();
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
