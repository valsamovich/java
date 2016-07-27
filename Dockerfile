FROM maven:3.2.5-jdk-8u40
EXPOSE 8080
RUN mvn verify clean
ADD /target/java-technologies-*.jar java-technologies.jar
ENTRYPOINT ["java","-jar","java-technologies.jar.jar"]