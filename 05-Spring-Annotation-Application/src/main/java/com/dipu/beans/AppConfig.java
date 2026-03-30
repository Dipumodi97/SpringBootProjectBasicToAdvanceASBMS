package com.dipu.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.dipu")
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig.AppConfig() :: Constructor ");
	}
	// I want to build the Robot Object 
	// robot object created by the Programmer -> It's Manual creating
	
	@Bean
	public Robot getCreated() {
		
		Robot r = new Robot();
		
		return r;
	}
}
