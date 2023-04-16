package org.ms.products_ms.products;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest
@SpringJUnitConfig(ProductsRestController.class)
public class ProductsRestControllerTest {

  @Autowired
  MockMvc mockMvc;

  @Test
  void shouldPerformsWithOkStatus() throws Exception {
    // when:
    var performed = mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/products"));

    // then:
    performed.andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.content().string("lorem ipsum dollar"));

    // when:
    performed = mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/products"));

    // then:
    performed.andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.content().string("lorem ipsum dollar"));
  }
}
