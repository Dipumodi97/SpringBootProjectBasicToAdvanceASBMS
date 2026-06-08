package com.dipu.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.dipu.interceptor.RequestLogInterceptoor;

@Configuration
public class AppConfig implements WebMvcConfigurer {
	
	@Autowired
	private RequestLogInterceptoor logInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(logInterceptor);
	}
}
