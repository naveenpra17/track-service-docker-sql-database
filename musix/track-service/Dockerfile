FROM openjdk:11
ENV MYSQL_DATABASE=track_service
ENV MYSQL_USER=root
ENV MYSQL_PASSWORD=root
ENV MYSQL_CI_URL=jdbc:mysql://172.17.0.2:3306/track_service
ADD target/track-service-0.0.1-SNAPSHOT.jar /usr/src/track-service-0.0.1-SNAPSHOT.jar
EXPOSE 8080
WORKDIR usr/src
ENTRYPOINT ["java","-jar","/usr/src/track-service-0.0.1-SNAPSHOT.jar"]
