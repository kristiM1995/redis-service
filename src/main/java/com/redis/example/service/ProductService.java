package com.redis.example.service;

import com.redis.example.model.Product;

import java.util.List;

public interface ProductService {
    Product addProduct(Product product);
    List<Product> findAll();
}
