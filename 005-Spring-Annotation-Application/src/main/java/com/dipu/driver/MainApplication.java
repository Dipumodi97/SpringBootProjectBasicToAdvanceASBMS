package com.dipu.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dipu.beans.AppConfig;
import com.dipu.beans.Motor;

public class MainApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		/**
		    Default scope is Singleton
		 
		Motor motor = applicationContext.getBean(Motor.class);
		System.out.println(motor.hashCode());
		
		Motor motor1 = applicationContext.getBean(Motor.class);
		System.out.println(motor1.hashCode()); */
		
		/*
		 * If Scope is prototype in Motor class then every time a new object will be created .
		 */
		Motor motor = applicationContext.getBean(Motor.class);
		System.out.println(motor.hashCode());
		
		Motor motor1 = applicationContext.getBean(Motor.class);
		System.out.println(motor1.hashCode());
	}
}
