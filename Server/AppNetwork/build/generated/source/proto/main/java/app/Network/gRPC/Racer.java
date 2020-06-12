// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gRPC.proto

package app.Network.gRPC;

/**
 * Protobuf type {@code Racer}
 */
public  final class Racer extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Racer)
    RacerOrBuilder {
  // Use Racer.newBuilder() to construct.
  private Racer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Racer() {
    id_ = 0L;
    name_ = "";
    team_ = 0;
    engine_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Racer(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            id_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            team_ = rawValue;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            engine_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return app.Network.gRPC.gRPC.internal_static_Racer_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.Network.gRPC.gRPC.internal_static_Racer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.Network.gRPC.Racer.class, app.Network.gRPC.Racer.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>optional int64 id = 1;</code>
   */
  public long getId() {
    return id_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>optional string name = 2;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>optional string name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEAM_FIELD_NUMBER = 3;
  private int team_;
  /**
   * <code>optional .Team team = 3;</code>
   */
  public int getTeamValue() {
    return team_;
  }
  /**
   * <code>optional .Team team = 3;</code>
   */
  public app.Network.gRPC.Team getTeam() {
    app.Network.gRPC.Team result = app.Network.gRPC.Team.valueOf(team_);
    return result == null ? app.Network.gRPC.Team.UNRECOGNIZED : result;
  }

  public static final int ENGINE_FIELD_NUMBER = 4;
  private int engine_;
  /**
   * <code>optional .Engine engine = 4;</code>
   */
  public int getEngineValue() {
    return engine_;
  }
  /**
   * <code>optional .Engine engine = 4;</code>
   */
  public app.Network.gRPC.Engine getEngine() {
    app.Network.gRPC.Engine result = app.Network.gRPC.Engine.valueOf(engine_);
    return result == null ? app.Network.gRPC.Engine.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (team_ != app.Network.gRPC.Team.RedBull.getNumber()) {
      output.writeEnum(3, team_);
    }
    if (engine_ != app.Network.gRPC.Engine.m75cm.getNumber()) {
      output.writeEnum(4, engine_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (team_ != app.Network.gRPC.Team.RedBull.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, team_);
    }
    if (engine_ != app.Network.gRPC.Engine.m75cm.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, engine_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof app.Network.gRPC.Racer)) {
      return super.equals(obj);
    }
    app.Network.gRPC.Racer other = (app.Network.gRPC.Racer) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getName()
        .equals(other.getName());
    result = result && team_ == other.team_;
    result = result && engine_ == other.engine_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + TEAM_FIELD_NUMBER;
    hash = (53 * hash) + team_;
    hash = (37 * hash) + ENGINE_FIELD_NUMBER;
    hash = (53 * hash) + engine_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.Network.gRPC.Racer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.Network.gRPC.Racer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.Network.gRPC.Racer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.Network.gRPC.Racer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.Network.gRPC.Racer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.Network.gRPC.Racer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.Network.gRPC.Racer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.Network.gRPC.Racer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.Network.gRPC.Racer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.Network.gRPC.Racer parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(app.Network.gRPC.Racer prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Racer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Racer)
      app.Network.gRPC.RacerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.Network.gRPC.gRPC.internal_static_Racer_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.Network.gRPC.gRPC.internal_static_Racer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.Network.gRPC.Racer.class, app.Network.gRPC.Racer.Builder.class);
    }

    // Construct using app.Network.gRPC.Racer.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      id_ = 0L;

      name_ = "";

      team_ = 0;

      engine_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.Network.gRPC.gRPC.internal_static_Racer_descriptor;
    }

    public app.Network.gRPC.Racer getDefaultInstanceForType() {
      return app.Network.gRPC.Racer.getDefaultInstance();
    }

    public app.Network.gRPC.Racer build() {
      app.Network.gRPC.Racer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public app.Network.gRPC.Racer buildPartial() {
      app.Network.gRPC.Racer result = new app.Network.gRPC.Racer(this);
      result.id_ = id_;
      result.name_ = name_;
      result.team_ = team_;
      result.engine_ = engine_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof app.Network.gRPC.Racer) {
        return mergeFrom((app.Network.gRPC.Racer)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.Network.gRPC.Racer other) {
      if (other == app.Network.gRPC.Racer.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.team_ != 0) {
        setTeamValue(other.getTeamValue());
      }
      if (other.engine_ != 0) {
        setEngineValue(other.getEngineValue());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      app.Network.gRPC.Racer parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.Network.gRPC.Racer) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long id_ ;
    /**
     * <code>optional int64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }
    /**
     * <code>optional int64 id = 1;</code>
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int team_ = 0;
    /**
     * <code>optional .Team team = 3;</code>
     */
    public int getTeamValue() {
      return team_;
    }
    /**
     * <code>optional .Team team = 3;</code>
     */
    public Builder setTeamValue(int value) {
      team_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Team team = 3;</code>
     */
    public app.Network.gRPC.Team getTeam() {
      app.Network.gRPC.Team result = app.Network.gRPC.Team.valueOf(team_);
      return result == null ? app.Network.gRPC.Team.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .Team team = 3;</code>
     */
    public Builder setTeam(app.Network.gRPC.Team value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      team_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .Team team = 3;</code>
     */
    public Builder clearTeam() {
      
      team_ = 0;
      onChanged();
      return this;
    }

    private int engine_ = 0;
    /**
     * <code>optional .Engine engine = 4;</code>
     */
    public int getEngineValue() {
      return engine_;
    }
    /**
     * <code>optional .Engine engine = 4;</code>
     */
    public Builder setEngineValue(int value) {
      engine_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Engine engine = 4;</code>
     */
    public app.Network.gRPC.Engine getEngine() {
      app.Network.gRPC.Engine result = app.Network.gRPC.Engine.valueOf(engine_);
      return result == null ? app.Network.gRPC.Engine.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .Engine engine = 4;</code>
     */
    public Builder setEngine(app.Network.gRPC.Engine value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      engine_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .Engine engine = 4;</code>
     */
    public Builder clearEngine() {
      
      engine_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:Racer)
  }

  // @@protoc_insertion_point(class_scope:Racer)
  private static final app.Network.gRPC.Racer DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.Network.gRPC.Racer();
  }

  public static app.Network.gRPC.Racer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Racer>
      PARSER = new com.google.protobuf.AbstractParser<Racer>() {
    public Racer parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Racer(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Racer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Racer> getParserForType() {
    return PARSER;
  }

  public app.Network.gRPC.Racer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

