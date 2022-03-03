package com.evozon.service;

import com.evozon.model.Product;
import com.evozon.repository.ProductRepository;

public interface ProductService {

    Product getById(String id);
    void setProductRepository(ProductRepository productRepository);
}
