FROM java:8
EXPOSE 8080
ADD /target/java-technologies-*.jar java-technologies.jar
ENTRYPOINT ["java","-jar","java-technologies.jar.jar"]