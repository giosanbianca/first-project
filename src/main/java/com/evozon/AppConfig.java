package com.evozon;

import com.evozon.repository.ProductRepository;
import com.evozon.repository.impl.CartRepositoryImpl;
import com.evozon.repository.impl.ProductRepositoryImpl;
import com.evozon.service.impl.CartServiceImpl;
import com.evozon.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CartRepositoryImpl cartRepositoryBean(){
        return new CartRepositoryImpl();
    }

    @Bean
    public ProductRepositoryImpl productRepositoryBean(){
        return new ProductRepositoryImpl();
    }

    @Bean
    @Autowired
    public ProductServiceImpl productServiceBean(ProductRepositoryImpl productRepository){
        return new ProductServiceImpl(productRepository);
    }

    @Bean
    @Autowired
    public CartServiceImpl cartServiceBean(CartRepositoryImpl cartRepository, ProductServiceImpl productService){
        return new CartServiceImpl(cartRepository, productService);
    }

}