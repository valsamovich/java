FROM maven:3.3.9-jdk-8-onbuild
RUN mvn clean package
ADD /target/java-technologies-*.jar java-technologies.jar
ENTRYPOINT ["java","-jar","java-technologies.jar"]