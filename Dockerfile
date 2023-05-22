FROM amazoncorretto:11-alpine-jdk
MAINTAINER fdbozzo
COPY target/auth-vivelibre-0.0.1-SNAPSHOT.jar auth-vivelibre-0.0.1.jar
ENTRYPOINT ["java","-jar","/auth-vivelibre-0.0.1.jar"]