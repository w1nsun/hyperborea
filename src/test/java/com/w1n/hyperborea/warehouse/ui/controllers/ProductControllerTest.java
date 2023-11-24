package com.w1n.hyperborea.warehouse.ui.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableMap;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@SpringBootTest
@AutoConfigureMockMvc
class ProductControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  void getAction() throws Exception {
    MvcResult result = mockMvc.perform(get("/warehouse/product")).andReturn();

    assertEquals(200, result.getResponse().getStatus());
  }

  @Test
  void createAction() throws Exception {
    String content = new ObjectMapper().writeValueAsString(
        ImmutableMap.builder()
            .put("productName", "test-integration2")
            .put("brandId", "01HF9XCNDSZY6CMTRGCYY6Z2AN")
            .put("category", "111")
            .put("description", 2222)
            .put("price", 10.0)
            .put("size", 1)
            .put("packageType", "BOTTLE")
            .put("packageSize", 111.1)
            .build()
    );
    MvcResult result = mockMvc.perform(post("/warehouse/product")
        .contentType(MediaType.APPLICATION_JSON)
        .content(content)
    ).andExpect(status().isCreated()).andReturn();
  }
}