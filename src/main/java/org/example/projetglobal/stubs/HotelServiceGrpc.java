package org.example.projetglobal.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: hotel.proto")
public final class HotelServiceGrpc {

  private HotelServiceGrpc() {}

  public static final String SERVICE_NAME = "HotelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.Empty,
      org.example.projetglobal.stubs.Hotel.GetAllClientsResponse> getAllClientsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "allClients",
      requestType = org.example.projetglobal.stubs.Hotel.Empty.class,
      responseType = org.example.projetglobal.stubs.Hotel.GetAllClientsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.Empty,
      org.example.projetglobal.stubs.Hotel.GetAllClientsResponse> getAllClientsMethod() {
    io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.Empty, org.example.projetglobal.stubs.Hotel.GetAllClientsResponse> getAllClientsMethod;
    if ((getAllClientsMethod = HotelServiceGrpc.getAllClientsMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getAllClientsMethod = HotelServiceGrpc.getAllClientsMethod) == null) {
          HotelServiceGrpc.getAllClientsMethod = getAllClientsMethod = 
              io.grpc.MethodDescriptor.<org.example.projetglobal.stubs.Hotel.Empty, org.example.projetglobal.stubs.Hotel.GetAllClientsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "allClients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.GetAllClientsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("allClients"))
                  .build();
          }
        }
     }
     return getAllClientsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ClientIdRequest,
      org.example.projetglobal.stubs.Hotel.Client> getClientByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "clientById",
      requestType = org.example.projetglobal.stubs.Hotel.ClientIdRequest.class,
      responseType = org.example.projetglobal.stubs.Hotel.Client.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ClientIdRequest,
      org.example.projetglobal.stubs.Hotel.Client> getClientByIdMethod() {
    io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ClientIdRequest, org.example.projetglobal.stubs.Hotel.Client> getClientByIdMethod;
    if ((getClientByIdMethod = HotelServiceGrpc.getClientByIdMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getClientByIdMethod = HotelServiceGrpc.getClientByIdMethod) == null) {
          HotelServiceGrpc.getClientByIdMethod = getClientByIdMethod = 
              io.grpc.MethodDescriptor.<org.example.projetglobal.stubs.Hotel.ClientIdRequest, org.example.projetglobal.stubs.Hotel.Client>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "clientById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.ClientIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.Client.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("clientById"))
                  .build();
          }
        }
     }
     return getClientByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ClientRequest,
      org.example.projetglobal.stubs.Hotel.Client> getSaveClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveClient",
      requestType = org.example.projetglobal.stubs.Hotel.ClientRequest.class,
      responseType = org.example.projetglobal.stubs.Hotel.Client.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ClientRequest,
      org.example.projetglobal.stubs.Hotel.Client> getSaveClientMethod() {
    io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ClientRequest, org.example.projetglobal.stubs.Hotel.Client> getSaveClientMethod;
    if ((getSaveClientMethod = HotelServiceGrpc.getSaveClientMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getSaveClientMethod = HotelServiceGrpc.getSaveClientMethod) == null) {
          HotelServiceGrpc.getSaveClientMethod = getSaveClientMethod = 
              io.grpc.MethodDescriptor.<org.example.projetglobal.stubs.Hotel.ClientRequest, org.example.projetglobal.stubs.Hotel.Client>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "saveClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.ClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.Client.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("saveClient"))
                  .build();
          }
        }
     }
     return getSaveClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ClientIdRequest,
      org.example.projetglobal.stubs.Hotel.BoolResponse> getDeleteClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteClient",
      requestType = org.example.projetglobal.stubs.Hotel.ClientIdRequest.class,
      responseType = org.example.projetglobal.stubs.Hotel.BoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ClientIdRequest,
      org.example.projetglobal.stubs.Hotel.BoolResponse> getDeleteClientMethod() {
    io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ClientIdRequest, org.example.projetglobal.stubs.Hotel.BoolResponse> getDeleteClientMethod;
    if ((getDeleteClientMethod = HotelServiceGrpc.getDeleteClientMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getDeleteClientMethod = HotelServiceGrpc.getDeleteClientMethod) == null) {
          HotelServiceGrpc.getDeleteClientMethod = getDeleteClientMethod = 
              io.grpc.MethodDescriptor.<org.example.projetglobal.stubs.Hotel.ClientIdRequest, org.example.projetglobal.stubs.Hotel.BoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "deleteClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.ClientIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.BoolResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("deleteClient"))
                  .build();
          }
        }
     }
     return getDeleteClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.Empty,
      org.example.projetglobal.stubs.Hotel.GetAllChambresResponse> getAllChambresMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "allChambres",
      requestType = org.example.projetglobal.stubs.Hotel.Empty.class,
      responseType = org.example.projetglobal.stubs.Hotel.GetAllChambresResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.Empty,
      org.example.projetglobal.stubs.Hotel.GetAllChambresResponse> getAllChambresMethod() {
    io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.Empty, org.example.projetglobal.stubs.Hotel.GetAllChambresResponse> getAllChambresMethod;
    if ((getAllChambresMethod = HotelServiceGrpc.getAllChambresMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getAllChambresMethod = HotelServiceGrpc.getAllChambresMethod) == null) {
          HotelServiceGrpc.getAllChambresMethod = getAllChambresMethod = 
              io.grpc.MethodDescriptor.<org.example.projetglobal.stubs.Hotel.Empty, org.example.projetglobal.stubs.Hotel.GetAllChambresResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "allChambres"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.GetAllChambresResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("allChambres"))
                  .build();
          }
        }
     }
     return getAllChambresMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ChambreIdRequest,
      org.example.projetglobal.stubs.Hotel.Chambre> getChambreByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "chambreById",
      requestType = org.example.projetglobal.stubs.Hotel.ChambreIdRequest.class,
      responseType = org.example.projetglobal.stubs.Hotel.Chambre.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ChambreIdRequest,
      org.example.projetglobal.stubs.Hotel.Chambre> getChambreByIdMethod() {
    io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ChambreIdRequest, org.example.projetglobal.stubs.Hotel.Chambre> getChambreByIdMethod;
    if ((getChambreByIdMethod = HotelServiceGrpc.getChambreByIdMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getChambreByIdMethod = HotelServiceGrpc.getChambreByIdMethod) == null) {
          HotelServiceGrpc.getChambreByIdMethod = getChambreByIdMethod = 
              io.grpc.MethodDescriptor.<org.example.projetglobal.stubs.Hotel.ChambreIdRequest, org.example.projetglobal.stubs.Hotel.Chambre>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "chambreById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.ChambreIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.Chambre.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("chambreById"))
                  .build();
          }
        }
     }
     return getChambreByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ChambreRequest,
      org.example.projetglobal.stubs.Hotel.Chambre> getSaveChambreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveChambre",
      requestType = org.example.projetglobal.stubs.Hotel.ChambreRequest.class,
      responseType = org.example.projetglobal.stubs.Hotel.Chambre.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ChambreRequest,
      org.example.projetglobal.stubs.Hotel.Chambre> getSaveChambreMethod() {
    io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ChambreRequest, org.example.projetglobal.stubs.Hotel.Chambre> getSaveChambreMethod;
    if ((getSaveChambreMethod = HotelServiceGrpc.getSaveChambreMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getSaveChambreMethod = HotelServiceGrpc.getSaveChambreMethod) == null) {
          HotelServiceGrpc.getSaveChambreMethod = getSaveChambreMethod = 
              io.grpc.MethodDescriptor.<org.example.projetglobal.stubs.Hotel.ChambreRequest, org.example.projetglobal.stubs.Hotel.Chambre>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "saveChambre"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.ChambreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.Chambre.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("saveChambre"))
                  .build();
          }
        }
     }
     return getSaveChambreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ChambreIdRequest,
      org.example.projetglobal.stubs.Hotel.BoolResponse> getDeleteChambreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteChambre",
      requestType = org.example.projetglobal.stubs.Hotel.ChambreIdRequest.class,
      responseType = org.example.projetglobal.stubs.Hotel.BoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ChambreIdRequest,
      org.example.projetglobal.stubs.Hotel.BoolResponse> getDeleteChambreMethod() {
    io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ChambreIdRequest, org.example.projetglobal.stubs.Hotel.BoolResponse> getDeleteChambreMethod;
    if ((getDeleteChambreMethod = HotelServiceGrpc.getDeleteChambreMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getDeleteChambreMethod = HotelServiceGrpc.getDeleteChambreMethod) == null) {
          HotelServiceGrpc.getDeleteChambreMethod = getDeleteChambreMethod = 
              io.grpc.MethodDescriptor.<org.example.projetglobal.stubs.Hotel.ChambreIdRequest, org.example.projetglobal.stubs.Hotel.BoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "deleteChambre"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.ChambreIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.BoolResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("deleteChambre"))
                  .build();
          }
        }
     }
     return getDeleteChambreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.Empty,
      org.example.projetglobal.stubs.Hotel.GetAllUtilisateursResponse> getAllUtilisateursMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "allUtilisateurs",
      requestType = org.example.projetglobal.stubs.Hotel.Empty.class,
      responseType = org.example.projetglobal.stubs.Hotel.GetAllUtilisateursResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.Empty,
      org.example.projetglobal.stubs.Hotel.GetAllUtilisateursResponse> getAllUtilisateursMethod() {
    io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.Empty, org.example.projetglobal.stubs.Hotel.GetAllUtilisateursResponse> getAllUtilisateursMethod;
    if ((getAllUtilisateursMethod = HotelServiceGrpc.getAllUtilisateursMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getAllUtilisateursMethod = HotelServiceGrpc.getAllUtilisateursMethod) == null) {
          HotelServiceGrpc.getAllUtilisateursMethod = getAllUtilisateursMethod = 
              io.grpc.MethodDescriptor.<org.example.projetglobal.stubs.Hotel.Empty, org.example.projetglobal.stubs.Hotel.GetAllUtilisateursResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "allUtilisateurs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.GetAllUtilisateursResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("allUtilisateurs"))
                  .build();
          }
        }
     }
     return getAllUtilisateursMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.UtilisateurIdRequest,
      org.example.projetglobal.stubs.Hotel.Utilisateur> getUtilisateurByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "utilisateurById",
      requestType = org.example.projetglobal.stubs.Hotel.UtilisateurIdRequest.class,
      responseType = org.example.projetglobal.stubs.Hotel.Utilisateur.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.UtilisateurIdRequest,
      org.example.projetglobal.stubs.Hotel.Utilisateur> getUtilisateurByIdMethod() {
    io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.UtilisateurIdRequest, org.example.projetglobal.stubs.Hotel.Utilisateur> getUtilisateurByIdMethod;
    if ((getUtilisateurByIdMethod = HotelServiceGrpc.getUtilisateurByIdMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getUtilisateurByIdMethod = HotelServiceGrpc.getUtilisateurByIdMethod) == null) {
          HotelServiceGrpc.getUtilisateurByIdMethod = getUtilisateurByIdMethod = 
              io.grpc.MethodDescriptor.<org.example.projetglobal.stubs.Hotel.UtilisateurIdRequest, org.example.projetglobal.stubs.Hotel.Utilisateur>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "utilisateurById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.UtilisateurIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.Utilisateur.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("utilisateurById"))
                  .build();
          }
        }
     }
     return getUtilisateurByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.UtilisateurRequest,
      org.example.projetglobal.stubs.Hotel.Utilisateur> getSaveUtilisateurMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveUtilisateur",
      requestType = org.example.projetglobal.stubs.Hotel.UtilisateurRequest.class,
      responseType = org.example.projetglobal.stubs.Hotel.Utilisateur.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.UtilisateurRequest,
      org.example.projetglobal.stubs.Hotel.Utilisateur> getSaveUtilisateurMethod() {
    io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.UtilisateurRequest, org.example.projetglobal.stubs.Hotel.Utilisateur> getSaveUtilisateurMethod;
    if ((getSaveUtilisateurMethod = HotelServiceGrpc.getSaveUtilisateurMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getSaveUtilisateurMethod = HotelServiceGrpc.getSaveUtilisateurMethod) == null) {
          HotelServiceGrpc.getSaveUtilisateurMethod = getSaveUtilisateurMethod = 
              io.grpc.MethodDescriptor.<org.example.projetglobal.stubs.Hotel.UtilisateurRequest, org.example.projetglobal.stubs.Hotel.Utilisateur>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "saveUtilisateur"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.UtilisateurRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.Utilisateur.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("saveUtilisateur"))
                  .build();
          }
        }
     }
     return getSaveUtilisateurMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.UtilisateurIdRequest,
      org.example.projetglobal.stubs.Hotel.BoolResponse> getDeleteUtilisateurMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteUtilisateur",
      requestType = org.example.projetglobal.stubs.Hotel.UtilisateurIdRequest.class,
      responseType = org.example.projetglobal.stubs.Hotel.BoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.UtilisateurIdRequest,
      org.example.projetglobal.stubs.Hotel.BoolResponse> getDeleteUtilisateurMethod() {
    io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.UtilisateurIdRequest, org.example.projetglobal.stubs.Hotel.BoolResponse> getDeleteUtilisateurMethod;
    if ((getDeleteUtilisateurMethod = HotelServiceGrpc.getDeleteUtilisateurMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getDeleteUtilisateurMethod = HotelServiceGrpc.getDeleteUtilisateurMethod) == null) {
          HotelServiceGrpc.getDeleteUtilisateurMethod = getDeleteUtilisateurMethod = 
              io.grpc.MethodDescriptor.<org.example.projetglobal.stubs.Hotel.UtilisateurIdRequest, org.example.projetglobal.stubs.Hotel.BoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "deleteUtilisateur"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.UtilisateurIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.BoolResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("deleteUtilisateur"))
                  .build();
          }
        }
     }
     return getDeleteUtilisateurMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.Empty,
      org.example.projetglobal.stubs.Hotel.GetAllReservationsResponse> getAllReservationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "allReservations",
      requestType = org.example.projetglobal.stubs.Hotel.Empty.class,
      responseType = org.example.projetglobal.stubs.Hotel.GetAllReservationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.Empty,
      org.example.projetglobal.stubs.Hotel.GetAllReservationsResponse> getAllReservationsMethod() {
    io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.Empty, org.example.projetglobal.stubs.Hotel.GetAllReservationsResponse> getAllReservationsMethod;
    if ((getAllReservationsMethod = HotelServiceGrpc.getAllReservationsMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getAllReservationsMethod = HotelServiceGrpc.getAllReservationsMethod) == null) {
          HotelServiceGrpc.getAllReservationsMethod = getAllReservationsMethod = 
              io.grpc.MethodDescriptor.<org.example.projetglobal.stubs.Hotel.Empty, org.example.projetglobal.stubs.Hotel.GetAllReservationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "allReservations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.GetAllReservationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("allReservations"))
                  .build();
          }
        }
     }
     return getAllReservationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ReservationIdRequest,
      org.example.projetglobal.stubs.Hotel.Reservation> getReservationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "reservationById",
      requestType = org.example.projetglobal.stubs.Hotel.ReservationIdRequest.class,
      responseType = org.example.projetglobal.stubs.Hotel.Reservation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ReservationIdRequest,
      org.example.projetglobal.stubs.Hotel.Reservation> getReservationByIdMethod() {
    io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ReservationIdRequest, org.example.projetglobal.stubs.Hotel.Reservation> getReservationByIdMethod;
    if ((getReservationByIdMethod = HotelServiceGrpc.getReservationByIdMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getReservationByIdMethod = HotelServiceGrpc.getReservationByIdMethod) == null) {
          HotelServiceGrpc.getReservationByIdMethod = getReservationByIdMethod = 
              io.grpc.MethodDescriptor.<org.example.projetglobal.stubs.Hotel.ReservationIdRequest, org.example.projetglobal.stubs.Hotel.Reservation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "reservationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.ReservationIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.Reservation.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("reservationById"))
                  .build();
          }
        }
     }
     return getReservationByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ReservationRequest,
      org.example.projetglobal.stubs.Hotel.Reservation> getSaveReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveReservation",
      requestType = org.example.projetglobal.stubs.Hotel.ReservationRequest.class,
      responseType = org.example.projetglobal.stubs.Hotel.Reservation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ReservationRequest,
      org.example.projetglobal.stubs.Hotel.Reservation> getSaveReservationMethod() {
    io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ReservationRequest, org.example.projetglobal.stubs.Hotel.Reservation> getSaveReservationMethod;
    if ((getSaveReservationMethod = HotelServiceGrpc.getSaveReservationMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getSaveReservationMethod = HotelServiceGrpc.getSaveReservationMethod) == null) {
          HotelServiceGrpc.getSaveReservationMethod = getSaveReservationMethod = 
              io.grpc.MethodDescriptor.<org.example.projetglobal.stubs.Hotel.ReservationRequest, org.example.projetglobal.stubs.Hotel.Reservation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "saveReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.ReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.Reservation.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("saveReservation"))
                  .build();
          }
        }
     }
     return getSaveReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ReservationIdRequest,
      org.example.projetglobal.stubs.Hotel.BoolResponse> getDeleteReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteReservation",
      requestType = org.example.projetglobal.stubs.Hotel.ReservationIdRequest.class,
      responseType = org.example.projetglobal.stubs.Hotel.BoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ReservationIdRequest,
      org.example.projetglobal.stubs.Hotel.BoolResponse> getDeleteReservationMethod() {
    io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.ReservationIdRequest, org.example.projetglobal.stubs.Hotel.BoolResponse> getDeleteReservationMethod;
    if ((getDeleteReservationMethod = HotelServiceGrpc.getDeleteReservationMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getDeleteReservationMethod = HotelServiceGrpc.getDeleteReservationMethod) == null) {
          HotelServiceGrpc.getDeleteReservationMethod = getDeleteReservationMethod = 
              io.grpc.MethodDescriptor.<org.example.projetglobal.stubs.Hotel.ReservationIdRequest, org.example.projetglobal.stubs.Hotel.BoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "deleteReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.ReservationIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.BoolResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("deleteReservation"))
                  .build();
          }
        }
     }
     return getDeleteReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.UpdateReservationRequest,
      org.example.projetglobal.stubs.Hotel.Reservation> getUpdateReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateReservation",
      requestType = org.example.projetglobal.stubs.Hotel.UpdateReservationRequest.class,
      responseType = org.example.projetglobal.stubs.Hotel.Reservation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.UpdateReservationRequest,
      org.example.projetglobal.stubs.Hotel.Reservation> getUpdateReservationMethod() {
    io.grpc.MethodDescriptor<org.example.projetglobal.stubs.Hotel.UpdateReservationRequest, org.example.projetglobal.stubs.Hotel.Reservation> getUpdateReservationMethod;
    if ((getUpdateReservationMethod = HotelServiceGrpc.getUpdateReservationMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getUpdateReservationMethod = HotelServiceGrpc.getUpdateReservationMethod) == null) {
          HotelServiceGrpc.getUpdateReservationMethod = getUpdateReservationMethod = 
              io.grpc.MethodDescriptor.<org.example.projetglobal.stubs.Hotel.UpdateReservationRequest, org.example.projetglobal.stubs.Hotel.Reservation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelService", "updateReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.UpdateReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.projetglobal.stubs.Hotel.Reservation.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("updateReservation"))
                  .build();
          }
        }
     }
     return getUpdateReservationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HotelServiceStub newStub(io.grpc.Channel channel) {
    return new HotelServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HotelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HotelServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HotelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HotelServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HotelServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Clients services
     * </pre>
     */
    public void allClients(org.example.projetglobal.stubs.Hotel.Empty request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.GetAllClientsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllClientsMethod(), responseObserver);
    }

    /**
     */
    public void clientById(org.example.projetglobal.stubs.Hotel.ClientIdRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Client> responseObserver) {
      asyncUnimplementedUnaryCall(getClientByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveClient(org.example.projetglobal.stubs.Hotel.ClientRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Client> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveClientMethod(), responseObserver);
    }

    /**
     */
    public void deleteClient(org.example.projetglobal.stubs.Hotel.ClientIdRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.BoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteClientMethod(), responseObserver);
    }

    /**
     * <pre>
     * Chambres services
     * </pre>
     */
    public void allChambres(org.example.projetglobal.stubs.Hotel.Empty request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.GetAllChambresResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllChambresMethod(), responseObserver);
    }

    /**
     */
    public void chambreById(org.example.projetglobal.stubs.Hotel.ChambreIdRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Chambre> responseObserver) {
      asyncUnimplementedUnaryCall(getChambreByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveChambre(org.example.projetglobal.stubs.Hotel.ChambreRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Chambre> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveChambreMethod(), responseObserver);
    }

    /**
     */
    public void deleteChambre(org.example.projetglobal.stubs.Hotel.ChambreIdRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.BoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteChambreMethod(), responseObserver);
    }

    /**
     * <pre>
     * Utilisateurs services
     * </pre>
     */
    public void allUtilisateurs(org.example.projetglobal.stubs.Hotel.Empty request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.GetAllUtilisateursResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllUtilisateursMethod(), responseObserver);
    }

    /**
     */
    public void utilisateurById(org.example.projetglobal.stubs.Hotel.UtilisateurIdRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Utilisateur> responseObserver) {
      asyncUnimplementedUnaryCall(getUtilisateurByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveUtilisateur(org.example.projetglobal.stubs.Hotel.UtilisateurRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Utilisateur> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveUtilisateurMethod(), responseObserver);
    }

    /**
     */
    public void deleteUtilisateur(org.example.projetglobal.stubs.Hotel.UtilisateurIdRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.BoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteUtilisateurMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reservations services
     * </pre>
     */
    public void allReservations(org.example.projetglobal.stubs.Hotel.Empty request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.GetAllReservationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllReservationsMethod(), responseObserver);
    }

    /**
     */
    public void reservationById(org.example.projetglobal.stubs.Hotel.ReservationIdRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Reservation> responseObserver) {
      asyncUnimplementedUnaryCall(getReservationByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveReservation(org.example.projetglobal.stubs.Hotel.ReservationRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Reservation> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveReservationMethod(), responseObserver);
    }

    /**
     */
    public void deleteReservation(org.example.projetglobal.stubs.Hotel.ReservationIdRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.BoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteReservationMethod(), responseObserver);
    }

    /**
     */
    public void updateReservation(org.example.projetglobal.stubs.Hotel.UpdateReservationRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Reservation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateReservationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllClientsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.projetglobal.stubs.Hotel.Empty,
                org.example.projetglobal.stubs.Hotel.GetAllClientsResponse>(
                  this, METHODID_ALL_CLIENTS)))
          .addMethod(
            getClientByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.projetglobal.stubs.Hotel.ClientIdRequest,
                org.example.projetglobal.stubs.Hotel.Client>(
                  this, METHODID_CLIENT_BY_ID)))
          .addMethod(
            getSaveClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.projetglobal.stubs.Hotel.ClientRequest,
                org.example.projetglobal.stubs.Hotel.Client>(
                  this, METHODID_SAVE_CLIENT)))
          .addMethod(
            getDeleteClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.projetglobal.stubs.Hotel.ClientIdRequest,
                org.example.projetglobal.stubs.Hotel.BoolResponse>(
                  this, METHODID_DELETE_CLIENT)))
          .addMethod(
            getAllChambresMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.projetglobal.stubs.Hotel.Empty,
                org.example.projetglobal.stubs.Hotel.GetAllChambresResponse>(
                  this, METHODID_ALL_CHAMBRES)))
          .addMethod(
            getChambreByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.projetglobal.stubs.Hotel.ChambreIdRequest,
                org.example.projetglobal.stubs.Hotel.Chambre>(
                  this, METHODID_CHAMBRE_BY_ID)))
          .addMethod(
            getSaveChambreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.projetglobal.stubs.Hotel.ChambreRequest,
                org.example.projetglobal.stubs.Hotel.Chambre>(
                  this, METHODID_SAVE_CHAMBRE)))
          .addMethod(
            getDeleteChambreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.projetglobal.stubs.Hotel.ChambreIdRequest,
                org.example.projetglobal.stubs.Hotel.BoolResponse>(
                  this, METHODID_DELETE_CHAMBRE)))
          .addMethod(
            getAllUtilisateursMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.projetglobal.stubs.Hotel.Empty,
                org.example.projetglobal.stubs.Hotel.GetAllUtilisateursResponse>(
                  this, METHODID_ALL_UTILISATEURS)))
          .addMethod(
            getUtilisateurByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.projetglobal.stubs.Hotel.UtilisateurIdRequest,
                org.example.projetglobal.stubs.Hotel.Utilisateur>(
                  this, METHODID_UTILISATEUR_BY_ID)))
          .addMethod(
            getSaveUtilisateurMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.projetglobal.stubs.Hotel.UtilisateurRequest,
                org.example.projetglobal.stubs.Hotel.Utilisateur>(
                  this, METHODID_SAVE_UTILISATEUR)))
          .addMethod(
            getDeleteUtilisateurMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.projetglobal.stubs.Hotel.UtilisateurIdRequest,
                org.example.projetglobal.stubs.Hotel.BoolResponse>(
                  this, METHODID_DELETE_UTILISATEUR)))
          .addMethod(
            getAllReservationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.projetglobal.stubs.Hotel.Empty,
                org.example.projetglobal.stubs.Hotel.GetAllReservationsResponse>(
                  this, METHODID_ALL_RESERVATIONS)))
          .addMethod(
            getReservationByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.projetglobal.stubs.Hotel.ReservationIdRequest,
                org.example.projetglobal.stubs.Hotel.Reservation>(
                  this, METHODID_RESERVATION_BY_ID)))
          .addMethod(
            getSaveReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.projetglobal.stubs.Hotel.ReservationRequest,
                org.example.projetglobal.stubs.Hotel.Reservation>(
                  this, METHODID_SAVE_RESERVATION)))
          .addMethod(
            getDeleteReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.projetglobal.stubs.Hotel.ReservationIdRequest,
                org.example.projetglobal.stubs.Hotel.BoolResponse>(
                  this, METHODID_DELETE_RESERVATION)))
          .addMethod(
            getUpdateReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.projetglobal.stubs.Hotel.UpdateReservationRequest,
                org.example.projetglobal.stubs.Hotel.Reservation>(
                  this, METHODID_UPDATE_RESERVATION)))
          .build();
    }
  }

  /**
   */
  public static final class HotelServiceStub extends io.grpc.stub.AbstractStub<HotelServiceStub> {
    private HotelServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotelServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotelServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Clients services
     * </pre>
     */
    public void allClients(org.example.projetglobal.stubs.Hotel.Empty request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.GetAllClientsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllClientsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void clientById(org.example.projetglobal.stubs.Hotel.ClientIdRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Client> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClientByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveClient(org.example.projetglobal.stubs.Hotel.ClientRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Client> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteClient(org.example.projetglobal.stubs.Hotel.ClientIdRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.BoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Chambres services
     * </pre>
     */
    public void allChambres(org.example.projetglobal.stubs.Hotel.Empty request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.GetAllChambresResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllChambresMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void chambreById(org.example.projetglobal.stubs.Hotel.ChambreIdRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Chambre> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChambreByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveChambre(org.example.projetglobal.stubs.Hotel.ChambreRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Chambre> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveChambreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteChambre(org.example.projetglobal.stubs.Hotel.ChambreIdRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.BoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteChambreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Utilisateurs services
     * </pre>
     */
    public void allUtilisateurs(org.example.projetglobal.stubs.Hotel.Empty request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.GetAllUtilisateursResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllUtilisateursMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void utilisateurById(org.example.projetglobal.stubs.Hotel.UtilisateurIdRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Utilisateur> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUtilisateurByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveUtilisateur(org.example.projetglobal.stubs.Hotel.UtilisateurRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Utilisateur> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveUtilisateurMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUtilisateur(org.example.projetglobal.stubs.Hotel.UtilisateurIdRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.BoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteUtilisateurMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reservations services
     * </pre>
     */
    public void allReservations(org.example.projetglobal.stubs.Hotel.Empty request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.GetAllReservationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllReservationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reservationById(org.example.projetglobal.stubs.Hotel.ReservationIdRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Reservation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReservationByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveReservation(org.example.projetglobal.stubs.Hotel.ReservationRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Reservation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteReservation(org.example.projetglobal.stubs.Hotel.ReservationIdRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.BoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateReservation(org.example.projetglobal.stubs.Hotel.UpdateReservationRequest request,
        io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Reservation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HotelServiceBlockingStub extends io.grpc.stub.AbstractStub<HotelServiceBlockingStub> {
    private HotelServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotelServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotelServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Clients services
     * </pre>
     */
    public org.example.projetglobal.stubs.Hotel.GetAllClientsResponse allClients(org.example.projetglobal.stubs.Hotel.Empty request) {
      return blockingUnaryCall(
          getChannel(), getAllClientsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.projetglobal.stubs.Hotel.Client clientById(org.example.projetglobal.stubs.Hotel.ClientIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getClientByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.projetglobal.stubs.Hotel.Client saveClient(org.example.projetglobal.stubs.Hotel.ClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.projetglobal.stubs.Hotel.BoolResponse deleteClient(org.example.projetglobal.stubs.Hotel.ClientIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteClientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Chambres services
     * </pre>
     */
    public org.example.projetglobal.stubs.Hotel.GetAllChambresResponse allChambres(org.example.projetglobal.stubs.Hotel.Empty request) {
      return blockingUnaryCall(
          getChannel(), getAllChambresMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.projetglobal.stubs.Hotel.Chambre chambreById(org.example.projetglobal.stubs.Hotel.ChambreIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getChambreByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.projetglobal.stubs.Hotel.Chambre saveChambre(org.example.projetglobal.stubs.Hotel.ChambreRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveChambreMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.projetglobal.stubs.Hotel.BoolResponse deleteChambre(org.example.projetglobal.stubs.Hotel.ChambreIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteChambreMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Utilisateurs services
     * </pre>
     */
    public org.example.projetglobal.stubs.Hotel.GetAllUtilisateursResponse allUtilisateurs(org.example.projetglobal.stubs.Hotel.Empty request) {
      return blockingUnaryCall(
          getChannel(), getAllUtilisateursMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.projetglobal.stubs.Hotel.Utilisateur utilisateurById(org.example.projetglobal.stubs.Hotel.UtilisateurIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getUtilisateurByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.projetglobal.stubs.Hotel.Utilisateur saveUtilisateur(org.example.projetglobal.stubs.Hotel.UtilisateurRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveUtilisateurMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.projetglobal.stubs.Hotel.BoolResponse deleteUtilisateur(org.example.projetglobal.stubs.Hotel.UtilisateurIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteUtilisateurMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reservations services
     * </pre>
     */
    public org.example.projetglobal.stubs.Hotel.GetAllReservationsResponse allReservations(org.example.projetglobal.stubs.Hotel.Empty request) {
      return blockingUnaryCall(
          getChannel(), getAllReservationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.projetglobal.stubs.Hotel.Reservation reservationById(org.example.projetglobal.stubs.Hotel.ReservationIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getReservationByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.projetglobal.stubs.Hotel.Reservation saveReservation(org.example.projetglobal.stubs.Hotel.ReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.projetglobal.stubs.Hotel.BoolResponse deleteReservation(org.example.projetglobal.stubs.Hotel.ReservationIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.projetglobal.stubs.Hotel.Reservation updateReservation(org.example.projetglobal.stubs.Hotel.UpdateReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateReservationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HotelServiceFutureStub extends io.grpc.stub.AbstractStub<HotelServiceFutureStub> {
    private HotelServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotelServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotelServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Clients services
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.projetglobal.stubs.Hotel.GetAllClientsResponse> allClients(
        org.example.projetglobal.stubs.Hotel.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getAllClientsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.projetglobal.stubs.Hotel.Client> clientById(
        org.example.projetglobal.stubs.Hotel.ClientIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClientByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.projetglobal.stubs.Hotel.Client> saveClient(
        org.example.projetglobal.stubs.Hotel.ClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.projetglobal.stubs.Hotel.BoolResponse> deleteClient(
        org.example.projetglobal.stubs.Hotel.ClientIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteClientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Chambres services
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.projetglobal.stubs.Hotel.GetAllChambresResponse> allChambres(
        org.example.projetglobal.stubs.Hotel.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getAllChambresMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.projetglobal.stubs.Hotel.Chambre> chambreById(
        org.example.projetglobal.stubs.Hotel.ChambreIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChambreByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.projetglobal.stubs.Hotel.Chambre> saveChambre(
        org.example.projetglobal.stubs.Hotel.ChambreRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveChambreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.projetglobal.stubs.Hotel.BoolResponse> deleteChambre(
        org.example.projetglobal.stubs.Hotel.ChambreIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteChambreMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Utilisateurs services
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.projetglobal.stubs.Hotel.GetAllUtilisateursResponse> allUtilisateurs(
        org.example.projetglobal.stubs.Hotel.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getAllUtilisateursMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.projetglobal.stubs.Hotel.Utilisateur> utilisateurById(
        org.example.projetglobal.stubs.Hotel.UtilisateurIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUtilisateurByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.projetglobal.stubs.Hotel.Utilisateur> saveUtilisateur(
        org.example.projetglobal.stubs.Hotel.UtilisateurRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveUtilisateurMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.projetglobal.stubs.Hotel.BoolResponse> deleteUtilisateur(
        org.example.projetglobal.stubs.Hotel.UtilisateurIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteUtilisateurMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reservations services
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.projetglobal.stubs.Hotel.GetAllReservationsResponse> allReservations(
        org.example.projetglobal.stubs.Hotel.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getAllReservationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.projetglobal.stubs.Hotel.Reservation> reservationById(
        org.example.projetglobal.stubs.Hotel.ReservationIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReservationByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.projetglobal.stubs.Hotel.Reservation> saveReservation(
        org.example.projetglobal.stubs.Hotel.ReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.projetglobal.stubs.Hotel.BoolResponse> deleteReservation(
        org.example.projetglobal.stubs.Hotel.ReservationIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.projetglobal.stubs.Hotel.Reservation> updateReservation(
        org.example.projetglobal.stubs.Hotel.UpdateReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALL_CLIENTS = 0;
  private static final int METHODID_CLIENT_BY_ID = 1;
  private static final int METHODID_SAVE_CLIENT = 2;
  private static final int METHODID_DELETE_CLIENT = 3;
  private static final int METHODID_ALL_CHAMBRES = 4;
  private static final int METHODID_CHAMBRE_BY_ID = 5;
  private static final int METHODID_SAVE_CHAMBRE = 6;
  private static final int METHODID_DELETE_CHAMBRE = 7;
  private static final int METHODID_ALL_UTILISATEURS = 8;
  private static final int METHODID_UTILISATEUR_BY_ID = 9;
  private static final int METHODID_SAVE_UTILISATEUR = 10;
  private static final int METHODID_DELETE_UTILISATEUR = 11;
  private static final int METHODID_ALL_RESERVATIONS = 12;
  private static final int METHODID_RESERVATION_BY_ID = 13;
  private static final int METHODID_SAVE_RESERVATION = 14;
  private static final int METHODID_DELETE_RESERVATION = 15;
  private static final int METHODID_UPDATE_RESERVATION = 16;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HotelServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HotelServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALL_CLIENTS:
          serviceImpl.allClients((org.example.projetglobal.stubs.Hotel.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.GetAllClientsResponse>) responseObserver);
          break;
        case METHODID_CLIENT_BY_ID:
          serviceImpl.clientById((org.example.projetglobal.stubs.Hotel.ClientIdRequest) request,
              (io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Client>) responseObserver);
          break;
        case METHODID_SAVE_CLIENT:
          serviceImpl.saveClient((org.example.projetglobal.stubs.Hotel.ClientRequest) request,
              (io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Client>) responseObserver);
          break;
        case METHODID_DELETE_CLIENT:
          serviceImpl.deleteClient((org.example.projetglobal.stubs.Hotel.ClientIdRequest) request,
              (io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.BoolResponse>) responseObserver);
          break;
        case METHODID_ALL_CHAMBRES:
          serviceImpl.allChambres((org.example.projetglobal.stubs.Hotel.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.GetAllChambresResponse>) responseObserver);
          break;
        case METHODID_CHAMBRE_BY_ID:
          serviceImpl.chambreById((org.example.projetglobal.stubs.Hotel.ChambreIdRequest) request,
              (io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Chambre>) responseObserver);
          break;
        case METHODID_SAVE_CHAMBRE:
          serviceImpl.saveChambre((org.example.projetglobal.stubs.Hotel.ChambreRequest) request,
              (io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Chambre>) responseObserver);
          break;
        case METHODID_DELETE_CHAMBRE:
          serviceImpl.deleteChambre((org.example.projetglobal.stubs.Hotel.ChambreIdRequest) request,
              (io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.BoolResponse>) responseObserver);
          break;
        case METHODID_ALL_UTILISATEURS:
          serviceImpl.allUtilisateurs((org.example.projetglobal.stubs.Hotel.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.GetAllUtilisateursResponse>) responseObserver);
          break;
        case METHODID_UTILISATEUR_BY_ID:
          serviceImpl.utilisateurById((org.example.projetglobal.stubs.Hotel.UtilisateurIdRequest) request,
              (io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Utilisateur>) responseObserver);
          break;
        case METHODID_SAVE_UTILISATEUR:
          serviceImpl.saveUtilisateur((org.example.projetglobal.stubs.Hotel.UtilisateurRequest) request,
              (io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Utilisateur>) responseObserver);
          break;
        case METHODID_DELETE_UTILISATEUR:
          serviceImpl.deleteUtilisateur((org.example.projetglobal.stubs.Hotel.UtilisateurIdRequest) request,
              (io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.BoolResponse>) responseObserver);
          break;
        case METHODID_ALL_RESERVATIONS:
          serviceImpl.allReservations((org.example.projetglobal.stubs.Hotel.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.GetAllReservationsResponse>) responseObserver);
          break;
        case METHODID_RESERVATION_BY_ID:
          serviceImpl.reservationById((org.example.projetglobal.stubs.Hotel.ReservationIdRequest) request,
              (io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Reservation>) responseObserver);
          break;
        case METHODID_SAVE_RESERVATION:
          serviceImpl.saveReservation((org.example.projetglobal.stubs.Hotel.ReservationRequest) request,
              (io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Reservation>) responseObserver);
          break;
        case METHODID_DELETE_RESERVATION:
          serviceImpl.deleteReservation((org.example.projetglobal.stubs.Hotel.ReservationIdRequest) request,
              (io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.BoolResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RESERVATION:
          serviceImpl.updateReservation((org.example.projetglobal.stubs.Hotel.UpdateReservationRequest) request,
              (io.grpc.stub.StreamObserver<org.example.projetglobal.stubs.Hotel.Reservation>) responseObserver);
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

  private static abstract class HotelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HotelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.projetglobal.stubs.Hotel.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HotelService");
    }
  }

  private static final class HotelServiceFileDescriptorSupplier
      extends HotelServiceBaseDescriptorSupplier {
    HotelServiceFileDescriptorSupplier() {}
  }

  private static final class HotelServiceMethodDescriptorSupplier
      extends HotelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HotelServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HotelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HotelServiceFileDescriptorSupplier())
              .addMethod(getAllClientsMethod())
              .addMethod(getClientByIdMethod())
              .addMethod(getSaveClientMethod())
              .addMethod(getDeleteClientMethod())
              .addMethod(getAllChambresMethod())
              .addMethod(getChambreByIdMethod())
              .addMethod(getSaveChambreMethod())
              .addMethod(getDeleteChambreMethod())
              .addMethod(getAllUtilisateursMethod())
              .addMethod(getUtilisateurByIdMethod())
              .addMethod(getSaveUtilisateurMethod())
              .addMethod(getDeleteUtilisateurMethod())
              .addMethod(getAllReservationsMethod())
              .addMethod(getReservationByIdMethod())
              .addMethod(getSaveReservationMethod())
              .addMethod(getDeleteReservationMethod())
              .addMethod(getUpdateReservationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
