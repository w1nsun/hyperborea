package com.w1n.hyperborea.warehouse.domain.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.Instant;


@Entity(name = "Product")
@Table(name = "warehouse_products")
public class Product {

  @Id
  @Column(name = "id", length = 26)
  private String id;

  @Column
  private String productName;


  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "brand_id")
  private Brand brand;

  @Column
  private String category;

  @Column
  private String description;

  @Column
  private BigDecimal price;

  @Column
  private BigDecimal size;

  @Column
  private String packageType;

  @Column
  private BigDecimal packageSize;

  @CreationTimestamp
  @Column
  private Instant updatedAt;

  @UpdateTimestamp
  @Column
  private Instant createdAt;

  public Product() {
  }

  public String getId() {
    return id;
  }

  public Product setId(String id) {
    this.id = id;

    return this;
  }

  public String getProductName() {
    return productName;
  }

  public Product setProductName(String productName) {
    this.productName = productName;

    return this;
  }

  public String getCategory() {
    return category;
  }

  public Product setCategory(String category) {
    this.category = category;

    return this;
  }

  public String getDescription() {
    return description;
  }

  public Product setDescription(String description) {
    this.description = description;

    return this;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public Product setPrice(BigDecimal price) {
    this.price = price;

    return this;
  }

  public BigDecimal getSize() {
    return size;
  }

  public Product setSize(BigDecimal size) {
    this.size = size;

    return this;
  }

  public String getPackageType() {
    return packageType;
  }

  public Product setPackageType(String packageType) {
    this.packageType = packageType;

    return this;
  }

  public BigDecimal getPackageSize() {
    return packageSize;
  }

  public Product setPackageSize(BigDecimal packageSize) {
    this.packageSize = packageSize;

    return this;
  }
}
