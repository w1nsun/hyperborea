package com.w1n.hyperborea.warehouse.domain.models;

import com.github.f4b6a3.ulid.UlidCreator;
import com.w1n.hyperborea.core.persistence.ULIDIdentity;

public class BrandId extends ULIDIdentity {
  public BrandId(String ulid) {
    super(ulid);
  }
}
