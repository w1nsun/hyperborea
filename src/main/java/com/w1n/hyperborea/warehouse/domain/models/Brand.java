package com.w1n.hyperborea.warehouse.domain.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Entity(name = "Brand")
@Table(name = "warehouse_brands")
public class Brand {
  @Id
  @Column(name = "id", length = 26)
  private String id;

  @Column
  private String title;

  @CreationTimestamp
  @Column
  private Instant updatedAt;

  @UpdateTimestamp
  @Column
  private Instant createdAt;
}
