# Springboot_JettyServer
Spring boot jetty example
May 5, 20120 Min Read
Common servlet container settings can be configured using Spring Environment properties. Usually, you would define the properties in your application.properties file.

Spring boot jetty as an embedded server

Step 1: exclude tomcat from spring boot web starter

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
    <exclusions>
        <exclusion>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-tomcat</artifactId>
        </exclusion>
    </exclusions>
</dependency>


  Step 2: Now add Jetty dependency – spring-boot-starter-jetty maven

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-jetty</artifactId>
</dependency>
That’s All…

How to run

mvn spring-boot:run
Download
