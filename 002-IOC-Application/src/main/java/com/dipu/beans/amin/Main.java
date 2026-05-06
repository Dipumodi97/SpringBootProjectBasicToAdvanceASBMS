package com.dipu.beans.amin;

import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.dipu.beans.Car;

public class Main {

	public static void main(String[] args) {

		/**
		 * It's Deprecated , So XmlBeanFactory ❌ (removed in newer Spring versions)
		 */
		//BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		
		/**
		 *  call the getBean() method using scope is prototype then object 
		 *  will be created. otherwise default is Singleton
		 */
		
		Car car = applicationContext.getBean(Car.class);
		System.out.println(car.hashCode());
		
		Car car1 = applicationContext.getBean(Car.class);
		System.out.println(car1.hashCode());
		car.drive();
		
	}
}
