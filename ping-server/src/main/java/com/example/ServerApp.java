package com.example;

import io.grpc.Server;
import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.protobuf.services.ProtoReflectionService;

public class ServerApp {
    public static void main(String[] args) throws Exception {
        Server server = Grpc.newServerBuilderForPort(8080, InsecureServerCredentials.create())
            .addService(new PingServiceImpl())
                .addService(ProtoReflectionService.newInstance())
            .build();
        server.start();
        System.out.println("Server started on port 8080");
        server.awaitTermination();
    }
}
