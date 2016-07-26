# Java technologies [![Build Status](https://travis-ci.org/vsamov/java-technologies.svg?branch=master)](https://travis-ci.org/vsamov/java-technologies) [![license](https://img.shields.io/github/license/mashape/apistatus.svg?maxAge=2592000)](LICENSE.md)

[**Java**](http://en.wikipedia.org/wiki/Java_%28programming_language%29) is Simple, Object Oriented, Distributed, Multithreaded, Dynamic, Architecture neutral, Portable, High performance, Robust, Secure. The **Java** [tutorial](http://docs.oracle.com/javase/tutorial/index.html) are practical guides for programmers who want to use the [**Java**](http://en.wikipedia.org/wiki/Java_%28programming_language%29) programming language to create applications.

[Oracle Java Documentations:](http://docs.oracle.com/javase/tutorial/index.html)
- Trail Covering the Basics.
- Creating Graphical User Interfaces (**`GUI`**).
- Specialized Trail and Lessons.

## MapReduce

[**WordCount**](/src/main/java/com/samovich/specialized/mapreduce/WordCount.java) example reads text files and counts how often words occur. To run mapreduce **Hadoop** environment is required. [Read more](
http://www.michael-noll.com/tutorials/running-hadoop-on-ubuntu-linux-single-node-cluster/) To run example:

- Run `mvn clean verify` for java-technologies project
- Optional: Copy `.jar` file to server which is connected to Hadoop
  - `scp -p target/*.jar [server-name]:` 
- Assume `hdfs` location is `/user/[user-name]/java-mapreduce`
- Copy [resource(s)](
https://github.com/vsamov/java-technologies/tree/master/src/main/resources/com/samovich/specialized/mapreduce) file to hdfs: `hdfs dfs -put /user/[user-name]/java-mapreduce`
- Run command below:
        
        # syntax: hadoop jar [jar-name].jar [java-class] [input-files] [output-dir]
        hadoop jar java-technologies-0.0.1-SNAPSHOT.jar com.samovich.specialized.mapreduce.WordCount /user/WDPRO-CUSTANALYTICS-PROD/java-mapreduce/*.txt /user/WDPRO-CUSTANALYTICS-PROD/java-mapreduce/output

## Appendix

- [Java Reference Guide](http://www.tutorialspoint.com/java/java_quick_guide.htm) is a **free** tutorial for syntax and examples.
- [Maven repositories](http://mvnrepository.com/) is used to hold build artifacts and dependencies of varying types.
- [JSON Online Editor](http://jsoneditoronline.org/) is a web-based tool to view, edit, and format `JSON` with tree view.
- [JSON Lint](http://jsonlint.com/) is a web-based `JSON` Validator.
- [JSON Path](http://ashphy.com/JSONPathOnlineEvaluator/) is a web-based online tool `JSON` Path evaluator.
- [Vogella](http://www.vogella.com/) Provides premium **Java**, Android and Git training and support.
- [Java Brains](http://javabrains.koushik.org/) Learn and advance your Java skills online.
- [Mkyong](http://www.mkyong.com/) Java, and Testing Frameworks, **Web Services** Build Tools examples and etc.
- [Michael Noll](http://www.michael-noll.com/) Applied Research. Big Data. Distributed Systems. Open Source.

## Notes

- **DRY** (Don't Repeat Yourself) and other tips from The Pragmatic Programmer
- **SOLID** Principles of Object-Oriented Programming:
  - S : Single Responsibility Principle
  - O : Open/Closed Principle
  - L : Liskov Substitution Principle
  - I : Interface Segregation Principle
  - D : Dependency Inversion Principle
