package app.Network.gRPC;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.0-pre2)",
    comments = "Source: gRPC.proto")
public class IServiceGrpc {

  private IServiceGrpc() {}

  public static final String SERVICE_NAME = "IService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<app.Network.gRPC.LogRequest,
      app.Network.gRPC.Response> METHOD_LOGIN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "IService", "login"),
          io.grpc.protobuf.ProtoUtils.marshaller(app.Network.gRPC.LogRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(app.Network.gRPC.Response.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<app.Network.gRPC.LogRequest,
      app.Network.gRPC.Response> METHOD_LOGOUT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "IService", "logout"),
          io.grpc.protobuf.ProtoUtils.marshaller(app.Network.gRPC.LogRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(app.Network.gRPC.Response.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<app.Network.gRPC.GetRaces,
      app.Network.gRPC.Race> METHOD_GET_AVAILABLE_RACES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "IService", "getAvailableRaces"),
          io.grpc.protobuf.ProtoUtils.marshaller(app.Network.gRPC.GetRaces.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(app.Network.gRPC.Race.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<app.Network.gRPC.GetRacers,
      app.Network.gRPC.Racer> METHOD_FIND_ALL_RACERS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "IService", "findAllRacers"),
          io.grpc.protobuf.ProtoUtils.marshaller(app.Network.gRPC.GetRacers.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(app.Network.gRPC.Racer.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<app.Network.gRPC.Request,
      app.Network.gRPC.Response> METHOD_MAKE_CALL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "IService", "makeCall"),
          io.grpc.protobuf.ProtoUtils.marshaller(app.Network.gRPC.Request.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(app.Network.gRPC.Response.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IServiceStub newStub(io.grpc.Channel channel) {
    return new IServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static IServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class IServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(app.Network.gRPC.LogRequest request,
        io.grpc.stub.StreamObserver<app.Network.gRPC.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOGIN, responseObserver);
    }

    /**
     */
    public void logout(app.Network.gRPC.LogRequest request,
        io.grpc.stub.StreamObserver<app.Network.gRPC.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOGOUT, responseObserver);
    }

    /**
     */
    public void getAvailableRaces(app.Network.gRPC.GetRaces request,
        io.grpc.stub.StreamObserver<app.Network.gRPC.Race> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_AVAILABLE_RACES, responseObserver);
    }

    /**
     */
    public void findAllRacers(app.Network.gRPC.GetRacers request,
        io.grpc.stub.StreamObserver<app.Network.gRPC.Racer> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_ALL_RACERS, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<app.Network.gRPC.Request> makeCall(
        io.grpc.stub.StreamObserver<app.Network.gRPC.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_MAKE_CALL, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LOGIN,
            asyncUnaryCall(
              new MethodHandlers<
                app.Network.gRPC.LogRequest,
                app.Network.gRPC.Response>(
                  this, METHODID_LOGIN)))
          .addMethod(
            METHOD_LOGOUT,
            asyncUnaryCall(
              new MethodHandlers<
                app.Network.gRPC.LogRequest,
                app.Network.gRPC.Response>(
                  this, METHODID_LOGOUT)))
          .addMethod(
            METHOD_GET_AVAILABLE_RACES,
            asyncServerStreamingCall(
              new MethodHandlers<
                app.Network.gRPC.GetRaces,
                app.Network.gRPC.Race>(
                  this, METHODID_GET_AVAILABLE_RACES)))
          .addMethod(
            METHOD_FIND_ALL_RACERS,
            asyncServerStreamingCall(
              new MethodHandlers<
                app.Network.gRPC.GetRacers,
                app.Network.gRPC.Racer>(
                  this, METHODID_FIND_ALL_RACERS)))
          .addMethod(
            METHOD_MAKE_CALL,
            asyncBidiStreamingCall(
              new MethodHandlers<
                app.Network.gRPC.Request,
                app.Network.gRPC.Response>(
                  this, METHODID_MAKE_CALL)))
          .build();
    }
  }

  /**
   */
  public static final class IServiceStub extends io.grpc.stub.AbstractStub<IServiceStub> {
    private IServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IServiceStub(channel, callOptions);
    }

    /**
     */
    public void login(app.Network.gRPC.LogRequest request,
        io.grpc.stub.StreamObserver<app.Network.gRPC.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOGIN, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(app.Network.gRPC.LogRequest request,
        io.grpc.stub.StreamObserver<app.Network.gRPC.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOGOUT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAvailableRaces(app.Network.gRPC.GetRaces request,
        io.grpc.stub.StreamObserver<app.Network.gRPC.Race> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_AVAILABLE_RACES, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAllRacers(app.Network.gRPC.GetRacers request,
        io.grpc.stub.StreamObserver<app.Network.gRPC.Racer> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_FIND_ALL_RACERS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<app.Network.gRPC.Request> makeCall(
        io.grpc.stub.StreamObserver<app.Network.gRPC.Response> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_MAKE_CALL, getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class IServiceBlockingStub extends io.grpc.stub.AbstractStub<IServiceBlockingStub> {
    private IServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public app.Network.gRPC.Response login(app.Network.gRPC.LogRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOGIN, getCallOptions(), request);
    }

    /**
     */
    public app.Network.gRPC.Response logout(app.Network.gRPC.LogRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOGOUT, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<app.Network.gRPC.Race> getAvailableRaces(
        app.Network.gRPC.GetRaces request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_AVAILABLE_RACES, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<app.Network.gRPC.Racer> findAllRacers(
        app.Network.gRPC.GetRacers request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_FIND_ALL_RACERS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IServiceFutureStub extends io.grpc.stub.AbstractStub<IServiceFutureStub> {
    private IServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.Network.gRPC.Response> login(
        app.Network.gRPC.LogRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOGIN, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.Network.gRPC.Response> logout(
        app.Network.gRPC.LogRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOGOUT, getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGOUT = 1;
  private static final int METHODID_GET_AVAILABLE_RACES = 2;
  private static final int METHODID_FIND_ALL_RACERS = 3;
  private static final int METHODID_MAKE_CALL = 4;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(IServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((app.Network.gRPC.LogRequest) request,
              (io.grpc.stub.StreamObserver<app.Network.gRPC.Response>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((app.Network.gRPC.LogRequest) request,
              (io.grpc.stub.StreamObserver<app.Network.gRPC.Response>) responseObserver);
          break;
        case METHODID_GET_AVAILABLE_RACES:
          serviceImpl.getAvailableRaces((app.Network.gRPC.GetRaces) request,
              (io.grpc.stub.StreamObserver<app.Network.gRPC.Race>) responseObserver);
          break;
        case METHODID_FIND_ALL_RACERS:
          serviceImpl.findAllRacers((app.Network.gRPC.GetRacers) request,
              (io.grpc.stub.StreamObserver<app.Network.gRPC.Racer>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MAKE_CALL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.makeCall(
              (io.grpc.stub.StreamObserver<app.Network.gRPC.Response>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_LOGIN,
        METHOD_LOGOUT,
        METHOD_GET_AVAILABLE_RACES,
        METHOD_FIND_ALL_RACERS,
        METHOD_MAKE_CALL);
  }

}
