// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Hello.proto

package com.example.grpc.demo.hello;

public interface HelloResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hello.HelloResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 code = 1;</code>
   * @return The code.
   */
  int getCode();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}