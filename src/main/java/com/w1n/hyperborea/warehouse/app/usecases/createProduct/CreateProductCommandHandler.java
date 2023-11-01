package com.w1n.hyperborea.warehouse.app.usecases.createProduct;

import com.w1n.hyperborea.core.app.usecases.ICommandHandler;
import org.springframework.stereotype.Component;

@Component
public class CreateProductCommandHandler implements ICommandHandler<CreateProductCommand, Object> {
  @Override
  public Object execute(CreateProductCommand command) {
    return null;
  }
}
