package com.w1n.hyperborea.warehouse.app.usecases.createproduct;

import com.w1n.hyperborea.core.app.usecases.ICommand;
import com.w1n.hyperborea.warehouse.domain.constraints.ProductPackageType;
import jakarta.validation.constraints.*;

public class CreateProductCommand implements ICommand {
  @NotBlank
  @Size(max = 100)
  public String productName;

  @NotBlank
  @Size(max = 100)
  public String brand;

  @NotBlank
  @Size(max = 100)
  public String category;

  @Size(max = 2000)
  public String description;

  @PositiveOrZero
  @DecimalMax(value = "10000000.00")
  public Double price;

  @Positive
  @Max(value = 100000000)
  public Integer size;

  @NotBlank
  @ProductPackageType
  public String packageType;

  @PositiveOrZero
  @DecimalMax(value = "10000000.00")
  public Double packageSize;
}
