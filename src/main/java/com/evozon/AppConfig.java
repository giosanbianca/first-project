package com.evozon;

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
    public CartRepositoryImpl cartRepositoryImpl() {
        return new CartRepositoryImpl();
    }

    @Bean
    public ProductRepositoryImpl productRepositoryImpl() {
        return new ProductRepositoryImpl();
    }

    @Bean
    public ProductServiceImpl productServiceImpl(ProductRepositoryImpl productRepositoryImpl) {
        return new ProductServiceImpl(productRepositoryImpl);
    }

    @Bean
    public CartServiceImpl cartServiceImpl(CartRepositoryImpl cartRepositoryImpl,ProductServiceImpl productServiceImpl) {
        return new CartServiceImpl(cartRepositoryImpl,productServiceImpl);
    }


}
