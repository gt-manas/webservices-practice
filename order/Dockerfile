FROM openjdk:11
WORKDIR /opt/app
ARG JAR_FILE=target/order-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} order.jar
ENTRYPOINT ["java","-jar","order.jar"]
