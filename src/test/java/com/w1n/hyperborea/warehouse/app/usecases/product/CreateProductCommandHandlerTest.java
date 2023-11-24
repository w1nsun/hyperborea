package com.w1n.hyperborea.warehouse.app.usecases.product;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.w1n.hyperborea.warehouse.domain.models.Product;
import com.w1n.hyperborea.warehouse.domain.repositories.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CreateProductCommandHandlerTest {
  @Test
  public void testCreate() {
    CreateProductCommand createProductCommand = new CreateProductCommand();
    createProductCommand.productName = "test";
    createProductCommand.category = "category";

    ProductRepository repoMock = mock(ProductRepository.class);
    when(repoMock.save(any(Product.class))).thenReturn(new Product());
    Product product = (new CreateProductCommandHandler(repoMock)).execute(createProductCommand);
    Assertions.assertInstanceOf(Product.class, product);
  }
}
