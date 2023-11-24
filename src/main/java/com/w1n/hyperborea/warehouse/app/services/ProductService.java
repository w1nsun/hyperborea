package com.w1n.hyperborea.warehouse.app.services;

import com.w1n.hyperborea.warehouse.app.usecases.product.CreateProductCommand;
import com.w1n.hyperborea.warehouse.app.usecases.product.CreateProductCommandHandler;
import com.w1n.hyperborea.warehouse.domain.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
  private CreateProductCommandHandler createProductHandler;

  @Autowired
  public ProductService(CreateProductCommandHandler createProductHandler) {
    this.createProductHandler = createProductHandler;
  }

  public Product create(CreateProductCommand createProductCommand) {
    return this.createProductHandler.execute(createProductCommand);
  }
}
