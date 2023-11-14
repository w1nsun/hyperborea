package com.w1n.hyperborea.warehouse.domain.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Entity(name = "ProductCategory")
@Table(name = "warehouse_product_categories")
public class ProductCategory {
  @Id
  @Column(name = "id", length = 26)
  private String id;

  @CreationTimestamp
  @Column
  private Instant updatedAt;

  @UpdateTimestamp
  @Column
  private Instant createdAt;
}
