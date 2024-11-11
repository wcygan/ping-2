# Ping 2

This is a rebuild of the original [Ping](https://github.com/wcygan/ping) project.

The goal of this project is to use new technologies like RedPanda and RisingWave to understand how "cloud-native" they
are; basically, how easy they are to build with on Kubernetes when compared to their counterparts like Kafka and Flink.

## Tech Stack

| Technology                                                                                                                                                              | Purpose                                                    |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------|
| [Java](https://dev.java/)                                                                                                                                               | Programming language used for the application              |
| [ConnectRPC](https://connectrpc.com/)                                                                                                                                   | Framework for remote procedure calls                       |
| [Protocol Buffers](https://protobuf.dev/)                                                                                                                               | Serialization format used with ConnectRPC                  |
| [RedPanda](https://www.redpanda.com/)                                                                                                                                   | Streaming Data Platform                                    |
| [RisingWave](https://risingwave.com/)                                                                                                                                   | Stream processing framework for real-time analytics        |
| [DragonflyDB](https://dragonflydb.io/)                                                                                                                                  | High-performance Redis-compatible in-memory store          |
| [Buf](https://buf.build/)                                                                                                                                               | Tool for working with Protocol Buffers                     |
| [Buf Schema Registry](https://buf.build/product/bsr)                                                                                                                    | Registry for storing and managing Protocol Buffers schemas |
| [Kubernetes](https://kubernetes.io/)                                                                                                                                    | Container orchestration platform                           |
| [Minikube](https://minikube.sigs.k8s.io/docs/start/?arch=%2Fmacos%2Farm64%2Fstable%2Fbinary+download) (or [Kind](https://kind.sigs.k8s.io/), or whatever else you have) | Tool for running a local Kubernetes cluster                |
| [Skaffold](https://skaffold.dev/)                                                                                                                                       | Tool for building and deploying applications on Kubernetes |
| [Orbstack](https://orbstack.dev/) (or [Docker Desktop](https://www.docker.com/products/docker-desktop/))                                                                | Virtualized environment for running containers             |
