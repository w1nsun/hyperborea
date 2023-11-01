package com.w1n.hyperborea.warehouse.app.services;

import com.w1n.hyperborea.warehouse.app.usecases.createProduct.CreateProductCommand;
import com.w1n.hyperborea.warehouse.app.usecases.createProduct.CreateProductCommandHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
  private CreateProductCommandHandler createProductHandler;

  @Autowired
  public ProductService(CreateProductCommandHandler createProductHandler) {
    this.createProductHandler = createProductHandler;
  }

  public void create(CreateProductCommand createProductCommand) {
    this.createProductHandler.execute(createProductCommand);
  }
}
