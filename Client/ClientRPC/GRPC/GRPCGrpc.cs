// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: Protos/gRPC.proto
// </auto-generated>
#pragma warning disable 0414, 1591
#region Designer generated code

using grpc = global::Grpc.Core;

namespace app.Networking.gRPC {
  public static partial class IService
  {
    static readonly string __ServiceName = "IService";

    static readonly grpc::Marshaller<global::app.Networking.gRPC.LogRequest> __Marshaller_LogRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::app.Networking.gRPC.LogRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::app.Networking.gRPC.Response> __Marshaller_Response = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::app.Networking.gRPC.Response.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::app.Networking.gRPC.GetRaces> __Marshaller_GetRaces = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::app.Networking.gRPC.GetRaces.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::app.Networking.gRPC.Race> __Marshaller_Race = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::app.Networking.gRPC.Race.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::app.Networking.gRPC.GetRacers> __Marshaller_GetRacers = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::app.Networking.gRPC.GetRacers.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::app.Networking.gRPC.Racer> __Marshaller_Racer = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::app.Networking.gRPC.Racer.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::app.Networking.gRPC.Request> __Marshaller_Request = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::app.Networking.gRPC.Request.Parser.ParseFrom);

    static readonly grpc::Method<global::app.Networking.gRPC.LogRequest, global::app.Networking.gRPC.Response> __Method_login = new grpc::Method<global::app.Networking.gRPC.LogRequest, global::app.Networking.gRPC.Response>(
        grpc::MethodType.Unary,
        __ServiceName,
        "login",
        __Marshaller_LogRequest,
        __Marshaller_Response);

    static readonly grpc::Method<global::app.Networking.gRPC.LogRequest, global::app.Networking.gRPC.Response> __Method_logout = new grpc::Method<global::app.Networking.gRPC.LogRequest, global::app.Networking.gRPC.Response>(
        grpc::MethodType.Unary,
        __ServiceName,
        "logout",
        __Marshaller_LogRequest,
        __Marshaller_Response);

    static readonly grpc::Method<global::app.Networking.gRPC.GetRaces, global::app.Networking.gRPC.Race> __Method_getAvailableRaces = new grpc::Method<global::app.Networking.gRPC.GetRaces, global::app.Networking.gRPC.Race>(
        grpc::MethodType.ServerStreaming,
        __ServiceName,
        "getAvailableRaces",
        __Marshaller_GetRaces,
        __Marshaller_Race);

    static readonly grpc::Method<global::app.Networking.gRPC.GetRacers, global::app.Networking.gRPC.Racer> __Method_findAllRacers = new grpc::Method<global::app.Networking.gRPC.GetRacers, global::app.Networking.gRPC.Racer>(
        grpc::MethodType.ServerStreaming,
        __ServiceName,
        "findAllRacers",
        __Marshaller_GetRacers,
        __Marshaller_Racer);

    static readonly grpc::Method<global::app.Networking.gRPC.Request, global::app.Networking.gRPC.Response> __Method_makeCall = new grpc::Method<global::app.Networking.gRPC.Request, global::app.Networking.gRPC.Response>(
        grpc::MethodType.DuplexStreaming,
        __ServiceName,
        "makeCall",
        __Marshaller_Request,
        __Marshaller_Response);

    /// <summary>Service descriptor</summary>
    public static global::Google.Protobuf.Reflection.ServiceDescriptor Descriptor
    {
      get { return global::app.Networking.gRPC.GRPCReflection.Descriptor.Services[0]; }
    }

    /// <summary>Client for IService</summary>
    public partial class IServiceClient : grpc::ClientBase<IServiceClient>
    {
      /// <summary>Creates a new client for IService</summary>
      /// <param name="channel">The channel to use to make remote calls.</param>
      public IServiceClient(grpc::ChannelBase channel) : base(channel)
      {
      }
      /// <summary>Creates a new client for IService that uses a custom <c>CallInvoker</c>.</summary>
      /// <param name="callInvoker">The callInvoker to use to make remote calls.</param>
      public IServiceClient(grpc::CallInvoker callInvoker) : base(callInvoker)
      {
      }
      /// <summary>Protected parameterless constructor to allow creation of test doubles.</summary>
      protected IServiceClient() : base()
      {
      }
      /// <summary>Protected constructor to allow creation of configured clients.</summary>
      /// <param name="configuration">The client configuration.</param>
      protected IServiceClient(ClientBaseConfiguration configuration) : base(configuration)
      {
      }

      public virtual global::app.Networking.gRPC.Response login(global::app.Networking.gRPC.LogRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return login(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      public virtual global::app.Networking.gRPC.Response login(global::app.Networking.gRPC.LogRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_login, null, options, request);
      }
      public virtual grpc::AsyncUnaryCall<global::app.Networking.gRPC.Response> loginAsync(global::app.Networking.gRPC.LogRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return loginAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      public virtual grpc::AsyncUnaryCall<global::app.Networking.gRPC.Response> loginAsync(global::app.Networking.gRPC.LogRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_login, null, options, request);
      }
      public virtual global::app.Networking.gRPC.Response logout(global::app.Networking.gRPC.LogRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return logout(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      public virtual global::app.Networking.gRPC.Response logout(global::app.Networking.gRPC.LogRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_logout, null, options, request);
      }
      public virtual grpc::AsyncUnaryCall<global::app.Networking.gRPC.Response> logoutAsync(global::app.Networking.gRPC.LogRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return logoutAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      public virtual grpc::AsyncUnaryCall<global::app.Networking.gRPC.Response> logoutAsync(global::app.Networking.gRPC.LogRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_logout, null, options, request);
      }
      public virtual grpc::AsyncServerStreamingCall<global::app.Networking.gRPC.Race> getAvailableRaces(global::app.Networking.gRPC.GetRaces request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return getAvailableRaces(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      public virtual grpc::AsyncServerStreamingCall<global::app.Networking.gRPC.Race> getAvailableRaces(global::app.Networking.gRPC.GetRaces request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncServerStreamingCall(__Method_getAvailableRaces, null, options, request);
      }
      public virtual grpc::AsyncServerStreamingCall<global::app.Networking.gRPC.Racer> findAllRacers(global::app.Networking.gRPC.GetRacers request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return findAllRacers(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      public virtual grpc::AsyncServerStreamingCall<global::app.Networking.gRPC.Racer> findAllRacers(global::app.Networking.gRPC.GetRacers request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncServerStreamingCall(__Method_findAllRacers, null, options, request);
      }
      public virtual grpc::AsyncDuplexStreamingCall<global::app.Networking.gRPC.Request, global::app.Networking.gRPC.Response> makeCall(grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return makeCall(new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      public virtual grpc::AsyncDuplexStreamingCall<global::app.Networking.gRPC.Request, global::app.Networking.gRPC.Response> makeCall(grpc::CallOptions options)
      {
        return CallInvoker.AsyncDuplexStreamingCall(__Method_makeCall, null, options);
      }
      /// <summary>Creates a new instance of client from given <c>ClientBaseConfiguration</c>.</summary>
      protected override IServiceClient NewInstance(ClientBaseConfiguration configuration)
      {
        return new IServiceClient(configuration);
      }
    }

  }
}
#endregion