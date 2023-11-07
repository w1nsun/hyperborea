package com.w1n.hyperborea.warehouse.ui.controllers;

import com.w1n.hyperborea.warehouse.app.services.ProductService;
import com.w1n.hyperborea.warehouse.app.usecases.createproduct.CreateProductCommand;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("warehouse/product")
public class ProductController {
  private final ProductService productService;

  @Autowired
  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public String create(@Valid @RequestBody CreateProductCommand createProductCommand) {
    this.productService.create(createProductCommand);

    return "OK";
  }
}
