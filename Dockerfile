FROM JAVA:8

EXPOSE 8080

ADD target/docker-demo.jar DeployProject.jar

ENTRYPOINT ["java","-jar","docker-demo.jar"]
