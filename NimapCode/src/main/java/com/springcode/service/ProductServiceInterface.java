package com.springcode.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.springcode.entity.Product;

public interface ProductServiceInterface {

    Page<Product> getAllProducts(Pageable pageable);

    Optional<Product> getProductById(Long productId);

    Product createProduct(Product product);

    Product updateProduct(Long productId, Product productDetails);

    void deleteProduct(Long productId);
}
