package com.w1n.hyperborea.warehouse.domain.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity(name = "Brand")
@Table(name = "warehouse_brands")
public class Brand {
  @Id
  @Column(name = "id", length = 26, nullable = false)
  private BrandId id;

  @Column
  private String title;

  @CreationTimestamp
  @Column
  private Instant updatedAt;

  @UpdateTimestamp
  @Column
  private Instant createdAt;

  public Brand() {
  }

  public Brand(BrandId id) {

  }

  public BrandId getId() {
    return id;
  }

  public Brand setId(BrandId id) {
    this.id = id;

    return this;
  }

  public String getTitle() {
    return title;
  }

  public Brand setTitle(String title) {
    this.title = title;

    return this;
  }
}
