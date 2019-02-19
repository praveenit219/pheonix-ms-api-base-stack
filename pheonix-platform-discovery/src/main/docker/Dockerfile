FROM openjdk:8-jre
VOLUME /tmp
ADD pheonix-platform-discovery.jar app.jar

EXPOSE 8761
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dpheonix.services.eureka.uri=discovery"]
CMD ["-jar","/app.jar"]
