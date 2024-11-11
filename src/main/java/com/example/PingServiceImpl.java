package com.example;

import io.grpc.stub.StreamObserver;
import ping.v1.PingRequest;
import ping.v1.PingResponse;
import ping.v1.PingServiceGrpc;

public class PingServiceImpl extends PingServiceGrpc.PingServiceImplBase {
    @Override
    public void ping(PingRequest request, StreamObserver<PingResponse> responseObserver) {
        PingResponse response = PingResponse.newBuilder()
            .setMessage("Pong!")
            .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
