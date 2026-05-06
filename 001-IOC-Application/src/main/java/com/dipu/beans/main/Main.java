package com.dipu.beans.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dipu.beans.Car;

public class Main {

	public static void main(String[] args) {
	
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("Beans.xml");
		
		Car car = applicationContext.getBean(Car.class);
		car.drive();
	}
}
