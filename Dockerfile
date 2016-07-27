FROM maven:3.2.5-jdk-8u40
RUN mvn clean package
ADD /target/java-technologies-*.jar java-technologies.jar
ENTRYPOINT ["java","-jar","java-technologies.jar"]