package com.w1n.hyperborea.warehouse.domain.constraints;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Target({
  ElementType.METHOD,
  ElementType.FIELD,
  ElementType.ANNOTATION_TYPE,
  ElementType.CONSTRUCTOR,
  ElementType.PARAMETER,
  ElementType.TYPE_USE
})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = ProductPackageTypeConstraintValidator.class)
public @interface ProductPackageType {
  String message() default "Invalid type";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
