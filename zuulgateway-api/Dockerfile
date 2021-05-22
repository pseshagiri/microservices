FROM openjdk:8-jre-alpine
COPY JAR_PATH=./target/*.jar
ARG ${JAR_PATH} app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","app.jar"]