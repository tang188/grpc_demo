// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Hello.proto

package com.example.grpc.demo.hello;

public final class HelloProto {
  private HelloProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hello_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hello_HelloResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hello_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hello_HelloRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\013Hello.proto\022\005hello\"+\n\rHelloResponse\022\014\n" +
      "\004code\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\"\034\n\014HelloReques" +
      "t\022\014\n\004name\030\001 \001(\t2A\n\tMyService\0224\n\005sayHi\022\023." +
      "hello.HelloRequest\032\024.hello.HelloResponse" +
      "\"\000B+\n\033com.example.grpc.demo.helloB\nHello" +
      "ProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_hello_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hello_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hello_HelloResponse_descriptor,
        new String[] { "Code", "Name", });
    internal_static_hello_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hello_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hello_HelloRequest_descriptor,
        new String[] { "Name", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
