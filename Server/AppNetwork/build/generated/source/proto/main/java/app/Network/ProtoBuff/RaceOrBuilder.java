// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProtoBuff.proto

package app.Network.ProtoBuff;

public interface RaceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:app.Proto.Race)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 id = 1;</code>
   */
  long getId();

  /**
   * <code>optional .app.Proto.Engine engine = 2;</code>
   */
  int getEngineValue();
  /**
   * <code>optional .app.Proto.Engine engine = 2;</code>
   */
  app.Network.ProtoBuff.Engine getEngine();

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