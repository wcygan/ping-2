package com.example;

import build.buf.gen.ping.v1.PingResponse;
import build.buf.gen.ping.v1.PingServiceGrpc;
import io.grpc.stub.StreamObserver;
import build.buf.gen.ping.v1.PingRequest;

public class PingServiceImpl extends PingServiceGrpc.PingServiceImplBase {
    @Override
    public void ping(PingRequest request, StreamObserver<PingResponse> responseObserver) {
        PingResponse response = PingResponse.newBuilder()
            .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
