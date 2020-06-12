// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gRPC.proto

package app.Network.gRPC;

/**
 * Protobuf enum {@code Team}
 */
public enum Team
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>RedBull = 0;</code>
   */
  RedBull(0),
  /**
   * <code>Toyota = 1;</code>
   */
  Toyota(1),
  /**
   * <code>Malboro = 2;</code>
   */
  Malboro(2),
  /**
   * <code>Pepsi = 3;</code>
   */
  Pepsi(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>RedBull = 0;</code>
   */
  public static final int RedBull_VALUE = 0;
  /**
   * <code>Toyota = 1;</code>
   */
  public static final int Toyota_VALUE = 1;
  /**
   * <code>Malboro = 2;</code>
   */
  public static final int Malboro_VALUE = 2;
  /**
   * <code>Pepsi = 3;</code>
   */
  public static final int Pepsi_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Team valueOf(int value) {
    return forNumber(value);
  }

  public static Team forNumber(int value) {
    switch (value) {
      case 0: return RedBull;
      case 1: return Toyota;
      case 2: return Malboro;
      case 3: return Pepsi;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Team>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Team> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Team>() {
          public Team findValueByNumber(int number) {
            return Team.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return app.Network.gRPC.gRPC.getDescriptor()
        .getEnumTypes().get(1);
  }

  private static final Team[] VALUES = values();

  public static Team valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Team(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Team)
}
