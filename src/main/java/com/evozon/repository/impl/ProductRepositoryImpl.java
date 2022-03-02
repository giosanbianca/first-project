package com.evozon.repository.impl;

import com.evozon.model.Product;
import com.evozon.repository.ProductRepository;

import java.util.Arrays;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

    private final List<Product> products = Arrays.asList(new Product("123"), new Product("456"), new Product("789"));

    public Product getById(String id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
