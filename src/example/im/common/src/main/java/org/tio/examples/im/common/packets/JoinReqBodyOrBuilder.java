// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/resources/chat.proto

package org.tio.examples.im.common.packets;

public interface JoinReqBodyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.tio.examples.im.common.packets.JoinReqBody)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *消息发送时间
   * </pre>
   *
   * <code>int64 time = 1;</code>
   */
  long getTime();

  /**
   * <code>string group = 2;</code>
   */
  java.lang.String getGroup();
  /**
   * <code>string group = 2;</code>
   */
  com.google.protobuf.ByteString
      getGroupBytes();
}