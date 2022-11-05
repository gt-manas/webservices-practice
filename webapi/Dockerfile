FROM openjdk:11
WORKDIR /opt/app
ARG JAR_FILE=target/webapi-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} webapi.jar
ENTRYPOINT ["java","-jar","webapi.jar"]
