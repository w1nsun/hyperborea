package com.w1n.hyperborea.warehouse.app.usecases.brand;

import com.w1n.hyperborea.core.app.usecases.ICommandHandler;
import com.w1n.hyperborea.core.persistence.ULIDIdentity;
import com.w1n.hyperborea.warehouse.domain.models.Brand;
import com.w1n.hyperborea.warehouse.domain.models.BrandId;
import com.w1n.hyperborea.warehouse.domain.repositories.BrandRepository;
import com.w1n.hyperborea.warehouse.domain.repositories.ProductRepository;

public class CreateBrandCommandHandler implements ICommandHandler<CreateBrandCommand, Brand> {
  private final BrandRepository brandRepo;

  public CreateBrandCommandHandler(BrandRepository brandRepo) {
    this.brandRepo = brandRepo;
  }

  @Override
  public Brand execute(CreateBrandCommand command) {
    Brand brand = new Brand(ULIDIdentity.generate(BrandId.class));
    brand.setTitle(command.title);

    this.brandRepo.save(brand);

    return brand;
  }
}
