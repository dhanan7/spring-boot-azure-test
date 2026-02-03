package com.example.azure.test.controller;

import com.example.azure.test.dao.ProductRepository;
import com.example.azure.test.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/product")
    public Product add(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping("/products")
    public List<Product> get() {
        return productRepository.findAll();
    }

   }
