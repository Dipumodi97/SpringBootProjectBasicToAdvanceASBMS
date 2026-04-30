package com.dipu;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dipu.entity.Product;
import com.dipu.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
		ProductRepository productRepository = context.getBean(ProductRepository.class);
	
		List<Product> products = productRepository.getAllProducts();
		
		products.forEach(System.out::println);
	}

}
