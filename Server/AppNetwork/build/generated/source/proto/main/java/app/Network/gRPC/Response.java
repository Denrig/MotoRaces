// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gRPC.proto

package app.Network.gRPC;

/**
 * Protobuf type {@code Response}
 */
public  final class Response extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Response)
    ResponseOrBuilder {
  // Use Response.newBuilder() to construct.
  private Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Response() {
    type_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Response(
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
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 26: {
            app.Network.gRPC.Racer.Builder subBuilder = null;
            if (racer_ != null) {
              subBuilder = racer_.toBuilder();
            }
            racer_ = input.readMessage(app.Network.gRPC.Racer.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(racer_);
              racer_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            app.Network.gRPC.Race.Builder subBuilder = null;
            if (race_ != null) {
              subBuilder = race_.toBuilder();
            }
            race_ = input.readMessage(app.Network.gRPC.Race.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(race_);
              race_ = subBuilder.buildPartial();
            }

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
    return app.Network.gRPC.gRPC.internal_static_Response_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.Network.gRPC.gRPC.internal_static_Response_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.Network.gRPC.Response.class, app.Network.gRPC.Response.Builder.class);
  }

  /**
   * Protobuf enum {@code Response.Type}
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ok = 0;</code>
     */
    ok(0),
    /**
     * <code>add = 1;</code>
     */
    add(1),
    /**
     * <code>delete = 2;</code>
     */
    delete(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ok = 0;</code>
     */
    public static final int ok_VALUE = 0;
    /**
     * <code>add = 1;</code>
     */
    public static final int add_VALUE = 1;
    /**
     * <code>delete = 2;</code>
     */
    public static final int delete_VALUE = 2;


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
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    public static Type forNumber(int value) {
      switch (value) {
        case 0: return ok;
        case 1: return add;
        case 2: return delete;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
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
      return app.Network.gRPC.Response.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
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

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Response.Type)
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>optional .Response.Type type = 1;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>optional .Response.Type type = 1;</code>
   */
  public app.Network.gRPC.Response.Type getType() {
    app.Network.gRPC.Response.Type result = app.Network.gRPC.Response.Type.valueOf(type_);
    return result == null ? app.Network.gRPC.Response.Type.UNRECOGNIZED : result;
  }

  public static final int RACER_FIELD_NUMBER = 3;
  private app.Network.gRPC.Racer racer_;
  /**
   * <code>optional .Racer racer = 3;</code>
   */
  public boolean hasRacer() {
    return racer_ != null;
  }
  /**
   * <code>optional .Racer racer = 3;</code>
   */
  public app.Network.gRPC.Racer getRacer() {
    return racer_ == null ? app.Network.gRPC.Racer.getDefaultInstance() : racer_;
  }
  /**
   * <code>optional .Racer racer = 3;</code>
   */
  public app.Network.gRPC.RacerOrBuilder getRacerOrBuilder() {
    return getRacer();
  }

  public static final int RACE_FIELD_NUMBER = 4;
  private app.Network.gRPC.Race race_;
  /**
   * <code>optional .Race race = 4;</code>
   */
  public boolean hasRace() {
    return race_ != null;
  }
  /**
   * <code>optional .Race race = 4;</code>
   */
  public app.Network.gRPC.Race getRace() {
    return race_ == null ? app.Network.gRPC.Race.getDefaultInstance() : race_;
  }
  /**
   * <code>optional .Race race = 4;</code>
   */
  public app.Network.gRPC.RaceOrBuilder getRaceOrBuilder() {
    return getRace();
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
    if (type_ != app.Network.gRPC.Response.Type.ok.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (racer_ != null) {
      output.writeMessage(3, getRacer());
    }
    if (race_ != null) {
      output.writeMessage(4, getRace());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != app.Network.gRPC.Response.Type.ok.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (racer_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getRacer());
    }
    if (race_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getRace());
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
    if (!(obj instanceof app.Network.gRPC.Response)) {
      return super.equals(obj);
    }
    app.Network.gRPC.Response other = (app.Network.gRPC.Response) obj;

    boolean result = true;
    result = result && type_ == other.type_;
    result = result && (hasRacer() == other.hasRacer());
    if (hasRacer()) {
      result = result && getRacer()
          .equals(other.getRacer());
    }
    result = result && (hasRace() == other.hasRace());
    if (hasRace()) {
      result = result && getRace()
          .equals(other.getRace());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    if (hasRacer()) {
      hash = (37 * hash) + RACER_FIELD_NUMBER;
      hash = (53 * hash) + getRacer().hashCode();
    }
    if (hasRace()) {
      hash = (37 * hash) + RACE_FIELD_NUMBER;
      hash = (53 * hash) + getRace().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.Network.gRPC.Response parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.Network.gRPC.Response parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.Network.gRPC.Response parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.Network.gRPC.Response parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.Network.gRPC.Response parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.Network.gRPC.Response parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.Network.gRPC.Response parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.Network.gRPC.Response parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.Network.gRPC.Response parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.Network.gRPC.Response parseFrom(
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
  public static Builder newBuilder(app.Network.gRPC.Response prototype) {
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
   * Protobuf type {@code Response}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Response)
      app.Network.gRPC.ResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.Network.gRPC.gRPC.internal_static_Response_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.Network.gRPC.gRPC.internal_static_Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.Network.gRPC.Response.class, app.Network.gRPC.Response.Builder.class);
    }

    // Construct using app.Network.gRPC.Response.newBuilder()
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
      type_ = 0;

      if (racerBuilder_ == null) {
        racer_ = null;
      } else {
        racer_ = null;
        racerBuilder_ = null;
      }
      if (raceBuilder_ == null) {
        race_ = null;
      } else {
        race_ = null;
        raceBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.Network.gRPC.gRPC.internal_static_Response_descriptor;
    }

    public app.Network.gRPC.Response getDefaultInstanceForType() {
      return app.Network.gRPC.Response.getDefaultInstance();
    }

    public app.Network.gRPC.Response build() {
      app.Network.gRPC.Response result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public app.Network.gRPC.Response buildPartial() {
      app.Network.gRPC.Response result = new app.Network.gRPC.Response(this);
      result.type_ = type_;
      if (racerBuilder_ == null) {
        result.racer_ = racer_;
      } else {
        result.racer_ = racerBuilder_.build();
      }
      if (raceBuilder_ == null) {
        result.race_ = race_;
      } else {
        result.race_ = raceBuilder_.build();
      }
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
      if (other instanceof app.Network.gRPC.Response) {
        return mergeFrom((app.Network.gRPC.Response)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.Network.gRPC.Response other) {
      if (other == app.Network.gRPC.Response.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.hasRacer()) {
        mergeRacer(other.getRacer());
      }
      if (other.hasRace()) {
        mergeRace(other.getRace());
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
      app.Network.gRPC.Response parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.Network.gRPC.Response) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <code>optional .Response.Type type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>optional .Response.Type type = 1;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Response.Type type = 1;</code>
     */
    public app.Network.gRPC.Response.Type getType() {
      app.Network.gRPC.Response.Type result = app.Network.gRPC.Response.Type.valueOf(type_);
      return result == null ? app.Network.gRPC.Response.Type.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .Response.Type type = 1;</code>
     */
    public Builder setType(app.Network.gRPC.Response.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .Response.Type type = 1;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private app.Network.gRPC.Racer racer_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        app.Network.gRPC.Racer, app.Network.gRPC.Racer.Builder, app.Network.gRPC.RacerOrBuilder> racerBuilder_;
    /**
     * <code>optional .Racer racer = 3;</code>
     */
    public boolean hasRacer() {
      return racerBuilder_ != null || racer_ != null;
    }
    /**
     * <code>optional .Racer racer = 3;</code>
     */
    public app.Network.gRPC.Racer getRacer() {
      if (racerBuilder_ == null) {
        return racer_ == null ? app.Network.gRPC.Racer.getDefaultInstance() : racer_;
      } else {
        return racerBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .Racer racer = 3;</code>
     */
    public Builder setRacer(app.Network.gRPC.Racer value) {
      if (racerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        racer_ = value;
        onChanged();
      } else {
        racerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .Racer racer = 3;</code>
     */
    public Builder setRacer(
        app.Network.gRPC.Racer.Builder builderForValue) {
      if (racerBuilder_ == null) {
        racer_ = builderForValue.build();
        onChanged();
      } else {
        racerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .Racer racer = 3;</code>
     */
    public Builder mergeRacer(app.Network.gRPC.Racer value) {
      if (racerBuilder_ == null) {
        if (racer_ != null) {
          racer_ =
            app.Network.gRPC.Racer.newBuilder(racer_).mergeFrom(value).buildPartial();
        } else {
          racer_ = value;
        }
        onChanged();
      } else {
        racerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .Racer racer = 3;</code>
     */
    public Builder clearRacer() {
      if (racerBuilder_ == null) {
        racer_ = null;
        onChanged();
      } else {
        racer_ = null;
        racerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .Racer racer = 3;</code>
     */
    public app.Network.gRPC.Racer.Builder getRacerBuilder() {
      
      onChanged();
      return getRacerFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .Racer racer = 3;</code>
     */
    public app.Network.gRPC.RacerOrBuilder getRacerOrBuilder() {
      if (racerBuilder_ != null) {
        return racerBuilder_.getMessageOrBuilder();
      } else {
        return racer_ == null ?
            app.Network.gRPC.Racer.getDefaultInstance() : racer_;
      }
    }
    /**
     * <code>optional .Racer racer = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        app.Network.gRPC.Racer, app.Network.gRPC.Racer.Builder, app.Network.gRPC.RacerOrBuilder> 
        getRacerFieldBuilder() {
      if (racerBuilder_ == null) {
        racerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            app.Network.gRPC.Racer, app.Network.gRPC.Racer.Builder, app.Network.gRPC.RacerOrBuilder>(
                getRacer(),
                getParentForChildren(),
                isClean());
        racer_ = null;
      }
      return racerBuilder_;
    }

    private app.Network.gRPC.Race race_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        app.Network.gRPC.Race, app.Network.gRPC.Race.Builder, app.Network.gRPC.RaceOrBuilder> raceBuilder_;
    /**
     * <code>optional .Race race = 4;</code>
     */
    public boolean hasRace() {
      return raceBuilder_ != null || race_ != null;
    }
    /**
     * <code>optional .Race race = 4;</code>
     */
    public app.Network.gRPC.Race getRace() {
      if (raceBuilder_ == null) {
        return race_ == null ? app.Network.gRPC.Race.getDefaultInstance() : race_;
      } else {
        return raceBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .Race race = 4;</code>
     */
    public Builder setRace(app.Network.gRPC.Race value) {
      if (raceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        race_ = value;
        onChanged();
      } else {
        raceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .Race race = 4;</code>
     */
    public Builder setRace(
        app.Network.gRPC.Race.Builder builderForValue) {
      if (raceBuilder_ == null) {
        race_ = builderForValue.build();
        onChanged();
      } else {
        raceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .Race race = 4;</code>
     */
    public Builder mergeRace(app.Network.gRPC.Race value) {
      if (raceBuilder_ == null) {
        if (race_ != null) {
          race_ =
            app.Network.gRPC.Race.newBuilder(race_).mergeFrom(value).buildPartial();
        } else {
          race_ = value;
        }
        onChanged();
      } else {
        raceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .Race race = 4;</code>
     */
    public Builder clearRace() {
      if (raceBuilder_ == null) {
        race_ = null;
        onChanged();
      } else {
        race_ = null;
        raceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .Race race = 4;</code>
     */
    public app.Network.gRPC.Race.Builder getRaceBuilder() {
      
      onChanged();
      return getRaceFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .Race race = 4;</code>
     */
    public app.Network.gRPC.RaceOrBuilder getRaceOrBuilder() {
      if (raceBuilder_ != null) {
        return raceBuilder_.getMessageOrBuilder();
      } else {
        return race_ == null ?
            app.Network.gRPC.Race.getDefaultInstance() : race_;
      }
    }
    /**
     * <code>optional .Race race = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        app.Network.gRPC.Race, app.Network.gRPC.Race.Builder, app.Network.gRPC.RaceOrBuilder> 
        getRaceFieldBuilder() {
      if (raceBuilder_ == null) {
        raceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            app.Network.gRPC.Race, app.Network.gRPC.Race.Builder, app.Network.gRPC.RaceOrBuilder>(
                getRace(),
                getParentForChildren(),
                isClean());
        race_ = null;
      }
      return raceBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:Response)
  }

  // @@protoc_insertion_point(class_scope:Response)
  private static final app.Network.gRPC.Response DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.Network.gRPC.Response();
  }

  public static app.Network.gRPC.Response getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Response>
      PARSER = new com.google.protobuf.AbstractParser<Response>() {
    public Response parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Response(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Response> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Response> getParserForType() {
    return PARSER;
  }

  public app.Network.gRPC.Response getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

