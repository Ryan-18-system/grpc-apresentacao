package br.edu.ifpb.grpcDemo.resources;

import br.edu.ifpb.grpcDemo.HelloReq;
import br.edu.ifpb.grpcDemo.HelloResp;
import br.edu.ifpb.grpcDemo.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;


@GrpcService
public class HelloResource extends HelloServiceGrpc.HelloServiceImplBase {
    @Override
    public void hello(HelloReq request, StreamObserver<HelloResp> responseObserver) {
        var response = HelloResp.newBuilder().setMessage("Ryan GRPC").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
