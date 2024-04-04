FROM openjdk:21

VOLUME /tmp

COPY target/*.jar Hotel-Admin-0.0.1-SNAPSHOT.jar

EXPOSE 30246
ENTRYPOINT ["java","-jar","/Hotel-Admin-0.0.1-SNAPSHOT.jar"]