FROM openjdk:20-jdk-slim
WORKDIR /application
COPY target/MakaraECommerce-0.0.1-SNAPSHOT.jar /application/MakaraECommerce-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD [ "java", "-jar", "MakaraECommerce-0.0.1-SNAPSHOT.jar" ]