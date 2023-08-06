package com.makara.logic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.makara.model.Product;

@Configuration
public class Config {

    @Bean
    @Scope("prototype")
    public Product product() {
        return new Product();
    }
}
