FROM openjdk:17
WORKDIR /products_ms
COPY ./target/products_ms-0.0.1-SNAPSHOT.jar /products_ms
CMD ["java", "-jar", "products_ms-0.0.1-SNAPSHOT.jar"]
