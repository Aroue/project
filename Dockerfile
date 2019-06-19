FROM openjdk:8-jre
MAINTAINER <blissleek@163.com>
WORKDIR /app
COPY ./target/project-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar *.jar"]