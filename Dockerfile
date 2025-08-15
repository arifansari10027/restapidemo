FROM openjdk:24

LABEL version="1"

EXPOSE 8000:8000

WORKDIR /app

COPY target/RESTAPIs-0.0.1-SNAPSHOT.jar /app/restapi-01.jar

ENTRYPOINT ["java", "-jar", "/app/restapi-01.jar"]