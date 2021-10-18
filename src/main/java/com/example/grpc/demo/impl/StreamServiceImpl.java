package com.example.grpc.demo.impl;

import com.example.grpc.demo.service.MyStreamServiceGrpc;
import com.example.grpc.demo.streamHello.StreamRequest;
import com.example.grpc.demo.streamHello.StreamResponse;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: Malphite
 * @date: 2021/10/18 7:10 下午
 * @version: 1.0
 * @group:
 */
@Slf4j
public class StreamServiceImpl extends MyStreamServiceGrpc.MyStreamServiceImplBase {

    @Override
    public void responseStream(StreamRequest request, StreamObserver<StreamResponse> responseObserver) {
        log.warn("responseStream: request param :{}", request.getName());
        responseObserver.onNext(StreamResponse.newBuilder().setData("答复 " + request.getName() + " 第一句话！").build());
        responseObserver.onNext(StreamResponse.newBuilder().setData("答复 " + request.getName() + " 第二句话！").build());
        responseObserver.onNext(StreamResponse.newBuilder().setData("答复 " + request.getName() + " 第三句话！").build());
        responseObserver.onCompleted();

    }

    @Override
    public StreamObserver<StreamRequest> requestStream(StreamObserver<StreamResponse> responseObserver) {
        return new StreamObserver<StreamRequest>() {
            @Override
            public void onNext(StreamRequest value) {
                log.warn("requestStream: request param: {}", value.getName());
            }

            @Override
            public void onError(Throwable t) {
                log.warn("requestStream: request param: {}", t.getMessage());
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(StreamResponse.newBuilder().setData("这是第一句话").build());
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<StreamRequest> bothStream(StreamObserver<StreamResponse> responseObserver) {
        return new StreamObserver<StreamRequest>() {
            @Override
            public void onNext(StreamRequest value) {
                log.warn("request: {}", value.getName());
                responseObserver.onNext(StreamResponse.newBuilder().setData("request: " + value.getName() + "-- response:" + "返回").build());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
