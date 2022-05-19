FROM openjdk:8u171-jre-alpine

WORKDIR /app

COPY target/*.jar app.jar

RUN sh -c 'mkdir -p keys log ignorefolder/h2 upload-folder' &&\
    sh -c 'chmod -R 777 keys log ignorefolder upload-folder'

ENV spring.profiles.active=dev,dev-k8
ENTRYPOINT ["java", "-Xms512m", "-Xmx512m", "-jar", "app.jar"]
