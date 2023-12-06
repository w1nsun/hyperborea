package com.w1n.hyperborea.warehouse.domain.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity(name = "ProductCategory")
@Table(name = "warehouse_product_categories")
public class ProductCategory {
  @Id
  @Column(name = "id", length = 26, nullable = false)
  private String id;

  @CreationTimestamp
  @Column
  private Instant updatedAt;

  @UpdateTimestamp
  @Column
  private Instant createdAt;
}
