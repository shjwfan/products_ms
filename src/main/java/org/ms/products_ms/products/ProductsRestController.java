package org.ms.products_ms.products;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsRestController {

  @GetMapping("/api/v1/products")
  public String getProducts() {
    return "lorem ipsum dollar";
  }

  @PostMapping("/api/v1/products")
  public String createProduct() {
    return "lorem ipsum dollar";
  }
}
