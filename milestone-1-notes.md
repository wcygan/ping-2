# Milestone 1

This milestone is all about running the server & testing basic functionality

## Building the image for [ping-server](/ping-server/pom.xml)

```bash
mvn clean packge
```

## Finding the latest dependency updates

```bash
mvn versions:display-dependency-updates
```

## Deploying ping-server on Kubernetes using Skaffold (Milestone 1)

```bash
skaffold dev
```

## Sending a gRPCurl with Reflection enabled

```bash
grpcurl -plaintext localhost:8080 ping.v1.PingService/Ping
```

## What it looks like for the server

In terminal 1:

```bash
wcygan@foobar ping-2 % grpcurl -plaintext localhost:8080 ping.v1.PingService/Ping
{}
wcygan@foobar ping-2 % grpcurl -plaintext localhost:8080 ping.v1.PingService/Ping
{}
```

In terminal 2:

```bash
[ping-server] Server started on port 8080
[ping-server] Ping received at unix timestamp: 1731349597414
[ping-server] Ping received at unix timestamp: 1731349597987
[ping-server] Ping received at unix timestamp: 1731349598374
```