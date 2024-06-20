package com.example.product.repository;

import com.example.product.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepo {
    Product save(Product product);
    Optional<Product> findById(Long id);
    List<Product> findAll();
    void update(Product product);
}
