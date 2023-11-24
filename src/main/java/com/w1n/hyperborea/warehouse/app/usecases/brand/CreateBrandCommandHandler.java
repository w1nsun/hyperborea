package com.w1n.hyperborea.warehouse.app.usecases.brand;

import com.w1n.hyperborea.core.app.usecases.ICommandHandler;
import com.w1n.hyperborea.warehouse.domain.models.Brand;

public class CreateBrandCommandHandler implements ICommandHandler<CreateBrandCommand, Brand> {
  @Override
  public Brand execute(CreateBrandCommand command) {
    return null;
  }
}
