package com.dipu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dipu.beans.MotorAnnotationBasedApproach;

public class MainClassTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		MotorAnnotationBasedApproach motorAnnotationBasedApproach = context.getBean(MotorAnnotationBasedApproach.class);
		
		motorAnnotationBasedApproach.doWork();
	}
}
