FROM openjdk:21-jdk
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
CMD ["java","-jar","/usr/src/myapp/target/springmvc_1-0.0.1-SNAPSHOT.jar"]