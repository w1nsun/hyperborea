package com.w1n.hyperborea.warehouse.ui.controllers;

import com.w1n.hyperborea.warehouse.app.services.ProductService;
import com.w1n.hyperborea.warehouse.app.usecases.product.CreateProductCommand;
import com.w1n.hyperborea.warehouse.domain.models.Product;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public String get() {
    return "index";
  }

  @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Product> create(@Valid @RequestBody CreateProductCommand createProductCommand) {
    Product product = this.productService.create(createProductCommand);

    return ResponseEntity.status(HttpStatus.CREATED).body(product);
  }
}
