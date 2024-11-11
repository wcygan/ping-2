# Notes

Random stuff I find while tinkering

## Building the image for [ping-server](/ping-server/pom.xml)

```bash
mvn clean packge
```

## Finding the latest dependency updates

```bash
mvn versions:display-dependency-updates
```

## Deploying ping-server on Kubernetes using Skaffold

```bash
skaffold dev
```

## Sending a gRPCurl with Reflection enabled

```bash
grpcurl -plaintext localhost:8080 ping.v1.PingService/Ping
```