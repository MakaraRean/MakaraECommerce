package com.makara.makaraecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.makara.controller", "com.makara.makaraecommerce"})
public class MakaraECommerceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MakaraECommerceApplication.class, args);
	}
}
