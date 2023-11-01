package com.redis.example.controller;

import com.redis.example.model.Product;
import com.redis.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private ProductService productService;

    @PostMapping("/add/product")
    public ResponseEntity<?>addProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.addProduct(product), HttpStatus.OK);
    }

    @GetMapping("/products")
    public ResponseEntity<?> getProducts(){
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }
}
