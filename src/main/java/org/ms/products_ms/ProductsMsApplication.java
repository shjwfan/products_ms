package org.ms.products_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan("org.ms.products_ms")
@Configuration
public class ProductsMsApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProductsMsApplication.class, args);
  }
}
