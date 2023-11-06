package com.w1n.hyperborea.warehouse.domain.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity(name = "Product")
@Table(name = "products")
public class Product {

  @Id
  @Column(name = "id")
  private String id;

  @Column(name = "product_name")
  private String productName;

  @Column
  private String brand;

  @Column
  private String category;

  @Column
  private String description;

  @Column
  private BigDecimal price;

  @Column
  private BigDecimal size;

  @Column(name = "package_type")
  private String packageType;

  @Column(name = "package_size")
  private BigDecimal packageSize;

  public Product() {}

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  public String getPackageType() {
    return packageType;
  }

  public void setPackageType(String packageType) {
    this.packageType = packageType;
  }

  public BigDecimal getPackageSize() {
    return packageSize;
  }

  public void setPackageSize(BigDecimal packageSize) {
    this.packageSize = packageSize;
  }
}
