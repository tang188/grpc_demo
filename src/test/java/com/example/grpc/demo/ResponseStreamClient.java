package com.example.grpc.demo;

import com.example.grpc.demo.service.MyServiceGrpc;
import com.example.grpc.demo.service.MyStreamServiceGrpc;
import com.example.grpc.demo.streamHello.StreamRequest;
import com.example.grpc.demo.streamHello.StreamResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;

/**
 * @author: Malphite
 * @date: 2021/10/18 7:52 下午
 * @version: 1.0
 * @group:
 */
@Slf4j
public class ResponseStreamClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50001)
                .usePlaintext().build();
        MyStreamServiceGrpc.MyStreamServiceBlockingStub blockingStub = MyStreamServiceGrpc.newBlockingStub(channel);

        log.info("流式响应：responseStream");
        Iterator<StreamResponse> responseIterable = blockingStub.responseStream(StreamRequest.newBuilder().setName("tangzhihong").build());
        while (responseIterable.hasNext()){
            StreamResponse response = responseIterable.next();
            log.warn("StreamResponse: {} ", response.getData());
        }
    }
}
