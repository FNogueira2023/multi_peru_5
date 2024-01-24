FROM openjdk:8-jre-alpine

EXPOSE 8080

COPY ./target/multi_peru_5-1.0-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java","-jar","multi_peru_5-1.0-SNAPSHOT.jar"]