// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gRPC.proto

package app.Network.gRPC;

public interface RaceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Race)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 id = 1;</code>
   */
  long getId();

  /**
   * <code>optional .Engine engine = 2;</code>
   */
  int getEngineValue();
  /**
   * <code>optional .Engine engine = 2;</code>
   */
  app.Network.gRPC.Engine getEngine();

  /**
   * <code>optional string Date = 3;</code>
   */
  java.lang.String getDate();
  /**
   * <code>optional string Date = 3;</code>
   */
  com.google.protobuf.ByteString
      getDateBytes();

  /**
   * <code>optional uint32 noRacers = 4;</code>
   */
  int getNoRacers();
}