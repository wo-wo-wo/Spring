FROM openjdk:8-jdk-alpine
EXPOSE 8084
VOLUME /tmp
COPY docker/startService.sh /startService.sh
RUN chmod +x /startService.sh
ADD target/myboots-1.5.14.RELEASE.jar  /app.jar
ENTRYPOINT ["./startService.sh"]
#CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
##ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]myboots-1.5.14.RELEASE.jar