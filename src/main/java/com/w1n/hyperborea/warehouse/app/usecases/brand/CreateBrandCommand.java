package com.w1n.hyperborea.warehouse.app.usecases.brand;

import com.w1n.hyperborea.core.app.usecases.ICommand;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CreateBrandCommand implements ICommand {
  @NotBlank
  @Size(max = 100)
  public String title;
}
