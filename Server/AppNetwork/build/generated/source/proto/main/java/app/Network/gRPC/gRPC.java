// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gRPC.proto

package app.Network.gRPC;

public final class gRPC {
  private gRPC() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LogRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LogRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetRaces_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetRaces_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetRacers_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetRacers_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Racer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Racer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Race_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Race_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ngRPC.proto\032\033google/protobuf/empty.prot" +
      "o\"y\n\010Response\022\034\n\004type\030\001 \001(\0162\016.Response.T" +
      "ype\022\025\n\005racer\030\003 \001(\0132\006.Racer\022\023\n\004race\030\004 \001(\013" +
      "2\005.Race\"#\n\004Type\022\006\n\002ok\020\000\022\007\n\003add\020\001\022\n\n\006dele" +
      "te\020\002\"\207\001\n\007Request\022\033\n\004type\030\003 \001(\0162\r.Request" +
      ".Type\022\025\n\005racer\030\005 \001(\0132\006.Racer\022\023\n\004race\030\004 \001" +
      "(\0132\005.Race\022\014\n\004user\030\006 \001(\t\"%\n\004Type\022\010\n\004init\020" +
      "\000\022\007\n\003add\020\001\022\n\n\006delete\020\002\"a\n\nLogRequest\022\036\n\004" +
      "type\030\003 \001(\0162\020.LogRequest.Type\022\014\n\004user\030\001 \001" +
      "(\t\022\014\n\004pass\030\002 \001(\t\"\027\n\004Type\022\006\n\002in\020\000\022\007\n\003out\020",
      "\002\"\n\n\010GetRaces\"\013\n\tGetRacers\"O\n\005Racer\022\n\n\002i" +
      "d\030\001 \001(\003\022\014\n\004name\030\002 \001(\t\022\023\n\004team\030\003 \001(\0162\005.Te" +
      "am\022\027\n\006engine\030\004 \001(\0162\007.Engine\"K\n\004Race\022\n\n\002i" +
      "d\030\001 \001(\003\022\027\n\006engine\030\002 \001(\0162\007.Engine\022\014\n\004Date" +
      "\030\003 \001(\t\022\020\n\010noRacers\030\004 \001(\r*+\n\006Engine\022\t\n\005m7" +
      "5cm\020\000\022\n\n\006m125cm\020\001\022\n\n\006m250cm\020\002*7\n\004Team\022\013\n" +
      "\007RedBull\020\000\022\n\n\006Toyota\020\001\022\013\n\007Malboro\020\002\022\t\n\005P" +
      "epsi\020\0032\302\001\n\010IService\022\037\n\005login\022\013.LogReques" +
      "t\032\t.Response\022 \n\006logout\022\013.LogRequest\032\t.Re" +
      "sponse\022\'\n\021getAvailableRaces\022\t.GetRaces\032\005",
      ".Race0\001\022%\n\rfindAllRacers\022\n.GetRacers\032\006.R" +
      "acer0\001\022#\n\010makeCall\022\010.Request\032\t.Response(" +
      "\0010\001B0\n\020app.Network.gRPCB\004gRPCP\001\252\002\023app.Ne" +
      "tworking.gRPCb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        }, assigner);
    internal_static_Response_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Response_descriptor,
        new java.lang.String[] { "Type", "Racer", "Race", });
    internal_static_Request_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Request_descriptor,
        new java.lang.String[] { "Type", "Racer", "Race", "User", });
    internal_static_LogRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_LogRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LogRequest_descriptor,
        new java.lang.String[] { "Type", "User", "Pass", });
    internal_static_GetRaces_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_GetRaces_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetRaces_descriptor,
        new java.lang.String[] { });
    internal_static_GetRacers_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_GetRacers_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetRacers_descriptor,
        new java.lang.String[] { });
    internal_static_Racer_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Racer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Racer_descriptor,
        new java.lang.String[] { "Id", "Name", "Team", "Engine", });
    internal_static_Race_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_Race_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Race_descriptor,
        new java.lang.String[] { "Id", "Engine", "Date", "NoRacers", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
