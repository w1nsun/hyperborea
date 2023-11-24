package com.w1n.hyperborea.warehouse.app.usecases.product;

import com.github.f4b6a3.ulid.UlidCreator;
import com.w1n.hyperborea.core.app.usecases.ICommandHandler;
import com.w1n.hyperborea.warehouse.domain.models.Product;
import com.w1n.hyperborea.warehouse.domain.repositories.ProductRepository;
import org.springframework.stereotype.Component;

@Component
public class CreateProductCommandHandler implements ICommandHandler<CreateProductCommand, Object> {
  private final ProductRepository productRepo;

  public CreateProductCommandHandler(ProductRepository productRepo) {
    this.productRepo = productRepo;
  }

  @Override
  public Product execute(CreateProductCommand command) {
    Product product = new Product();
    product
        .setId(UlidCreator.getUlid().toString())
        .setProductName(command.productName);

    this.productRepo.save(product);

    return product;
  }
}
