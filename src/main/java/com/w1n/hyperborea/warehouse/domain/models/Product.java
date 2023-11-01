package com.w1n.hyperborea.warehouse.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Product")
@Table(name = "products")
public class Product {

  @Id
  public int id;
}
