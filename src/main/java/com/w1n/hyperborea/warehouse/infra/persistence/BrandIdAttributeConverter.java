package com.w1n.hyperborea.warehouse.infra.persistence;

import com.w1n.hyperborea.warehouse.domain.models.BrandId;
import jakarta.persistence.AttributeConverter;

public class BrandIdAttributeConverter implements AttributeConverter<BrandId, String> {
  @Override
  public String convertToDatabaseColumn(BrandId attribute) {
    return attribute == null ? null : attribute.getULID();
  }

  @Override
  public BrandId convertToEntityAttribute(String dbData) {
    return dbData == null ? null : new BrandId(dbData);
  }
}
