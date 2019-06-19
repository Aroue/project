FROM openjdk:8-jre
MAINTAINER <blissleek@163.com>
WORKDIR /project
COPY ./target/*.jar /project
EXPOSE 8080
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar *.jar"]