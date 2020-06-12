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
public class IObserverGrpc {

  private IObserverGrpc() {}

  public static final String SERVICE_NAME = "IObserver";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<app.Network.gRPC.Response,
      com.google.protobuf.Empty> METHOD_RACER_ADDED =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "IObserver", "racerAdded"),
          io.grpc.protobuf.ProtoUtils.marshaller(app.Network.gRPC.Response.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<app.Network.gRPC.Response,
      com.google.protobuf.Empty> METHOD_RACER_DELETED =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "IObserver", "racerDeleted"),
          io.grpc.protobuf.ProtoUtils.marshaller(app.Network.gRPC.Response.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IObserverStub newStub(io.grpc.Channel channel) {
    return new IObserverStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IObserverBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IObserverBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static IObserverFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IObserverFutureStub(channel);
  }

  /**
   */
  public static abstract class IObserverImplBase implements io.grpc.BindableService {

    /**
     */
    public void racerAdded(app.Network.gRPC.Response request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RACER_ADDED, responseObserver);
    }

    /**
     */
    public void racerDeleted(app.Network.gRPC.Response request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RACER_DELETED, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_RACER_ADDED,
            asyncUnaryCall(
              new MethodHandlers<
                app.Network.gRPC.Response,
                com.google.protobuf.Empty>(
                  this, METHODID_RACER_ADDED)))
          .addMethod(
            METHOD_RACER_DELETED,
            asyncUnaryCall(
              new MethodHandlers<
                app.Network.gRPC.Response,
                com.google.protobuf.Empty>(
                  this, METHODID_RACER_DELETED)))
          .build();
    }
  }

  /**
   */
  public static final class IObserverStub extends io.grpc.stub.AbstractStub<IObserverStub> {
    private IObserverStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IObserverStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IObserverStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IObserverStub(channel, callOptions);
    }

    /**
     */
    public void racerAdded(app.Network.gRPC.Response request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RACER_ADDED, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void racerDeleted(app.Network.gRPC.Response request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RACER_DELETED, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IObserverBlockingStub extends io.grpc.stub.AbstractStub<IObserverBlockingStub> {
    private IObserverBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IObserverBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IObserverBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IObserverBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty racerAdded(app.Network.gRPC.Response request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RACER_ADDED, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty racerDeleted(app.Network.gRPC.Response request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RACER_DELETED, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IObserverFutureStub extends io.grpc.stub.AbstractStub<IObserverFutureStub> {
    private IObserverFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IObserverFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IObserverFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IObserverFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> racerAdded(
        app.Network.gRPC.Response request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RACER_ADDED, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> racerDeleted(
        app.Network.gRPC.Response request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RACER_DELETED, getCallOptions()), request);
    }
  }

  private static final int METHODID_RACER_ADDED = 0;
  private static final int METHODID_RACER_DELETED = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IObserverImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(IObserverImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RACER_ADDED:
          serviceImpl.racerAdded((app.Network.gRPC.Response) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_RACER_DELETED:
          serviceImpl.racerDeleted((app.Network.gRPC.Response) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_RACER_ADDED,
        METHOD_RACER_DELETED);
  }

}
