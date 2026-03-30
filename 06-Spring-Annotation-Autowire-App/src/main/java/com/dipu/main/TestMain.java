package com.dipu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dipu.configuration.AppConfig;
import com.dipu.service.ReportService;

public class TestMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ReportService reportService = context.getBean(ReportService.class);
		
		reportService.generate();
		
		reportService.generatePdf();
	
	}
}
