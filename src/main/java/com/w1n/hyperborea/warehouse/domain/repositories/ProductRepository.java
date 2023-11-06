package com.w1n.hyperborea.warehouse.domain.repositories;

import com.w1n.hyperborea.warehouse.domain.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, String> {
}
