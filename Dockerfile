FROM openjdk:11-jre-slim
MAINTAINER Luong Tran <luongtx@gmail.com>
WORKDIR /myapp
COPY /target/product-order-service.jar /myapp
EXPOSE 3333
ENTRYPOINT ["java", "-jar", "product-order-service.jar"]