FROM maven:3.3.9-jdk-8-onbuild
CMD ["java","-jar","/usr/src/app/target/java-technologies-0.0.1-SNAPSHOT.jar"]