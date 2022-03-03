package com.evozon;

import com.evozon.repository.CartRepository;
import com.evozon.repository.ProductRepository;
import com.evozon.repository.impl.CartRepositoryImpl;
import com.evozon.repository.impl.ProductRepositoryImpl;
import com.evozon.service.CartService;
import com.evozon.service.ProductService;
import com.evozon.service.impl.CartServiceImpl;
import com.evozon.service.impl.ProductServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ProductRepository productRepository() {
        return new ProductRepositoryImpl();
    }

    @Bean
    public CartRepository cartRepository() {
        return new CartRepositoryImpl();
    }

    @Bean
    public ProductService productService() {
        ProductService productService = new ProductServiceImpl();
        productService.setProductRepository(productRepository());
        return productService;
    }

    @Bean
    public CartService cartService(CartRepository cartRepository, ProductService productService) {
        return new CartServiceImpl(cartRepository, productService);
    }
}
