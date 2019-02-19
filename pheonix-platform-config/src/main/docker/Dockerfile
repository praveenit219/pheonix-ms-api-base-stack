FROM openjdk:8-jre
VOLUME /tmp
VOLUME /tmp
ADD pheonix-platform-config.jar app.jar

EXPOSE 8888
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dpheonix.services.eureka.uri=discovery"]
CMD ["-jar","/app.jar"]