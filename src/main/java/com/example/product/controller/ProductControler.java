package com.example.product.controller;

import com.example.product.entity.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductControler {
    ResponseEntity<Product> createProduct(Product product);
    ResponseEntity<Product> getProductById(Long id);
    ResponseEntity<List<Product>> getAllProducts();
    ResponseEntity<Product> updateProduct(Long id, Product updatedProduct);
}