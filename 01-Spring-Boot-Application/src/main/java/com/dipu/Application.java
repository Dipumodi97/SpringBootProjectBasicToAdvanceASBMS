package com.dipu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.dipu.service.UserService;
import com.dipu.util.PwtUtils;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(Application.class, args);
		
		System.out.println(context.getClass().getName());
		
		/*
		UserService s1 = new UserService();
		System.out.println(s1.hashCode());
		
		UserService s2 = new UserService();
		System.out.println(s2.hashCode());
		*/
	}
	
	@Bean
	public PwtUtils getInstance() {
		// logic
		
		PwtUtils utils = new PwtUtils();
		System.out.println(utils.hashCode());
		
		PwtUtils utils1 = new PwtUtils();
		System.out.println(utils1.hashCode());
		
		return new PwtUtils();
	}

}
