FROM openjdk:15
COPY target/k8sExample-*-SNAPSHOT.jar k8sExample.jar
CMD ["java","-jar","k8sExample.jar"]