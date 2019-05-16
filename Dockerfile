FROM maven:latest as maven
COPY . /build
WORKDIR /build
RUN mvn clean package
FROM java:8
WORKDIR /opt/back-end
COPY --from=maven /build/target/web-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["/usr/bin/java", "-jar", "app.jar"]

