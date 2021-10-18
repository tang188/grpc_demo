package com.example.grpc.demo.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.30.2)",
    comments = "Source: StreamHello.proto")
public final class MyStreamServiceGrpc {

  private MyStreamServiceGrpc() {}

  public static final String SERVICE_NAME = "streamHello.MyStreamService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.demo.streamHello.StreamRequest,
      com.example.grpc.demo.streamHello.StreamResponse> getResponseStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "responseStream",
      requestType = com.example.grpc.demo.streamHello.StreamRequest.class,
      responseType = com.example.grpc.demo.streamHello.StreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.demo.streamHello.StreamRequest,
      com.example.grpc.demo.streamHello.StreamResponse> getResponseStreamMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.demo.streamHello.StreamRequest, com.example.grpc.demo.streamHello.StreamResponse> getResponseStreamMethod;
    if ((getResponseStreamMethod = MyStreamServiceGrpc.getResponseStreamMethod) == null) {
      synchronized (MyStreamServiceGrpc.class) {
        if ((getResponseStreamMethod = MyStreamServiceGrpc.getResponseStreamMethod) == null) {
          MyStreamServiceGrpc.getResponseStreamMethod = getResponseStreamMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.demo.streamHello.StreamRequest, com.example.grpc.demo.streamHello.StreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "responseStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.demo.streamHello.StreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.demo.streamHello.StreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MyStreamServiceMethodDescriptorSupplier("responseStream"))
              .build();
        }
      }
    }
    return getResponseStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.demo.streamHello.StreamRequest,
      com.example.grpc.demo.streamHello.StreamResponse> getRequestStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "requestStream",
      requestType = com.example.grpc.demo.streamHello.StreamRequest.class,
      responseType = com.example.grpc.demo.streamHello.StreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.demo.streamHello.StreamRequest,
      com.example.grpc.demo.streamHello.StreamResponse> getRequestStreamMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.demo.streamHello.StreamRequest, com.example.grpc.demo.streamHello.StreamResponse> getRequestStreamMethod;
    if ((getRequestStreamMethod = MyStreamServiceGrpc.getRequestStreamMethod) == null) {
      synchronized (MyStreamServiceGrpc.class) {
        if ((getRequestStreamMethod = MyStreamServiceGrpc.getRequestStreamMethod) == null) {
          MyStreamServiceGrpc.getRequestStreamMethod = getRequestStreamMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.demo.streamHello.StreamRequest, com.example.grpc.demo.streamHello.StreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "requestStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.demo.streamHello.StreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.demo.streamHello.StreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MyStreamServiceMethodDescriptorSupplier("requestStream"))
              .build();
        }
      }
    }
    return getRequestStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.demo.streamHello.StreamRequest,
      com.example.grpc.demo.streamHello.StreamResponse> getBothStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bothStream",
      requestType = com.example.grpc.demo.streamHello.StreamRequest.class,
      responseType = com.example.grpc.demo.streamHello.StreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.demo.streamHello.StreamRequest,
      com.example.grpc.demo.streamHello.StreamResponse> getBothStreamMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.demo.streamHello.StreamRequest, com.example.grpc.demo.streamHello.StreamResponse> getBothStreamMethod;
    if ((getBothStreamMethod = MyStreamServiceGrpc.getBothStreamMethod) == null) {
      synchronized (MyStreamServiceGrpc.class) {
        if ((getBothStreamMethod = MyStreamServiceGrpc.getBothStreamMethod) == null) {
          MyStreamServiceGrpc.getBothStreamMethod = getBothStreamMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.demo.streamHello.StreamRequest, com.example.grpc.demo.streamHello.StreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "bothStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.demo.streamHello.StreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.demo.streamHello.StreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MyStreamServiceMethodDescriptorSupplier("bothStream"))
              .build();
        }
      }
    }
    return getBothStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MyStreamServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyStreamServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyStreamServiceStub>() {
        @Override
        public MyStreamServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyStreamServiceStub(channel, callOptions);
        }
      };
    return MyStreamServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MyStreamServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyStreamServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyStreamServiceBlockingStub>() {
        @Override
        public MyStreamServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyStreamServiceBlockingStub(channel, callOptions);
        }
      };
    return MyStreamServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MyStreamServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyStreamServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyStreamServiceFutureStub>() {
        @Override
        public MyStreamServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyStreamServiceFutureStub(channel, callOptions);
        }
      };
    return MyStreamServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MyStreamServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void responseStream(com.example.grpc.demo.streamHello.StreamRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.demo.streamHello.StreamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getResponseStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.demo.streamHello.StreamRequest> requestStream(
        io.grpc.stub.StreamObserver<com.example.grpc.demo.streamHello.StreamResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getRequestStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.demo.streamHello.StreamRequest> bothStream(
        io.grpc.stub.StreamObserver<com.example.grpc.demo.streamHello.StreamResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getBothStreamMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getResponseStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.example.grpc.demo.streamHello.StreamRequest,
                com.example.grpc.demo.streamHello.StreamResponse>(
                  this, METHODID_RESPONSE_STREAM)))
          .addMethod(
            getRequestStreamMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.example.grpc.demo.streamHello.StreamRequest,
                com.example.grpc.demo.streamHello.StreamResponse>(
                  this, METHODID_REQUEST_STREAM)))
          .addMethod(
            getBothStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.example.grpc.demo.streamHello.StreamRequest,
                com.example.grpc.demo.streamHello.StreamResponse>(
                  this, METHODID_BOTH_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class MyStreamServiceStub extends io.grpc.stub.AbstractAsyncStub<MyStreamServiceStub> {
    private MyStreamServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MyStreamServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyStreamServiceStub(channel, callOptions);
    }

    /**
     */
    public void responseStream(com.example.grpc.demo.streamHello.StreamRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.demo.streamHello.StreamResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getResponseStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.demo.streamHello.StreamRequest> requestStream(
        io.grpc.stub.StreamObserver<com.example.grpc.demo.streamHello.StreamResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getRequestStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.demo.streamHello.StreamRequest> bothStream(
        io.grpc.stub.StreamObserver<com.example.grpc.demo.streamHello.StreamResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getBothStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class MyStreamServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MyStreamServiceBlockingStub> {
    private MyStreamServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MyStreamServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyStreamServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.example.grpc.demo.streamHello.StreamResponse> responseStream(
        com.example.grpc.demo.streamHello.StreamRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getResponseStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MyStreamServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MyStreamServiceFutureStub> {
    private MyStreamServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MyStreamServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyStreamServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_RESPONSE_STREAM = 0;
  private static final int METHODID_REQUEST_STREAM = 1;
  private static final int METHODID_BOTH_STREAM = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MyStreamServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MyStreamServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RESPONSE_STREAM:
          serviceImpl.responseStream((com.example.grpc.demo.streamHello.StreamRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.demo.streamHello.StreamResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REQUEST_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.requestStream(
              (io.grpc.stub.StreamObserver<com.example.grpc.demo.streamHello.StreamResponse>) responseObserver);
        case METHODID_BOTH_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bothStream(
              (io.grpc.stub.StreamObserver<com.example.grpc.demo.streamHello.StreamResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MyStreamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MyStreamServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.demo.streamHello.StreamHello.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MyStreamService");
    }
  }

  private static final class MyStreamServiceFileDescriptorSupplier
      extends MyStreamServiceBaseDescriptorSupplier {
    MyStreamServiceFileDescriptorSupplier() {}
  }

  private static final class MyStreamServiceMethodDescriptorSupplier
      extends MyStreamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MyStreamServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MyStreamServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MyStreamServiceFileDescriptorSupplier())
              .addMethod(getResponseStreamMethod())
              .addMethod(getRequestStreamMethod())
              .addMethod(getBothStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
