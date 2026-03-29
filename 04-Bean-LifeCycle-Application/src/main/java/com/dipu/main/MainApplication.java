package com.dipu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dipu.beans.Motor;
import com.dipu.beans.MotorAnnotationBasedApproach;
import com.dipu.beans.MotorImplementationBeanLifeCycle;

public class MainApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("Spring-Beans.xml");
		Motor motor = applicationContext.getBean(Motor.class);
		motor.doWork();
		MotorImplementationBeanLifeCycle bean1 = 
				applicationContext.getBean(MotorImplementationBeanLifeCycle.class);
		bean1.doWork();
		
		MotorAnnotationBasedApproach bean2 = 
				applicationContext.getBean(MotorAnnotationBasedApproach.class);
		bean2.doWork();
		
	}
}
