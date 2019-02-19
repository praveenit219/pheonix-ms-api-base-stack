#FROM openjdk:8-jre
FROM openjdk:8-jre-alpine
RUN apk add --no-cache bash

VOLUME /tmp
VOLUME /tmp
ADD pheonix-platform-config.jar app.jar

EXPOSE 8888
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dpheonix.services.eureka.uri=discovery"]
CMD ["-jar","/app.jar"]