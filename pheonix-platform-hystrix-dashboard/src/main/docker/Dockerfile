FROM openjdk:8-jre-alpine
RUN apk add --no-cache bash

VOLUME /tmp
ADD pheonix-platform-hystrix-dashboard.jar app.jar

EXPOSE 8989
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=docker","-Dpheonix.services.eureka.uri=discovery"]
CMD ["-jar","/app.jar"]
