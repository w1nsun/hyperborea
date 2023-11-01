package com.w1n.hyperborea.warehouse.domain.constraints;

import com.w1n.hyperborea.warehouse.domain.enums.ProductEnum;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ProductPackageTypeConstraintValidator
    implements ConstraintValidator<ProductPackageType, String> {
  @Override
  public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
    if (s == null) {
      return true;
    }

    for (ProductEnum.PackageType c : ProductEnum.PackageType.values()) {
      if (c.name().equals(s.toUpperCase())) {
        return true;
      }
    }

    return false;
  }

  @Override
  public void initialize(ProductPackageType constraintAnnotation) {
    ConstraintValidator.super.initialize(constraintAnnotation);
  }
}
