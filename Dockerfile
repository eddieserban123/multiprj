FROM registry.devops.mercuria.systems/dockerhub/library/eclipse-temurin:17-focal

ARG buildid
ENV MVN_ID $buildid

EXPOSE 8080