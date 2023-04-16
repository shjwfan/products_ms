package org.ms.products_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("org.ms.products_ms")
public class ProductsMsApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProductsMsApplication.class, args);
  }
}
