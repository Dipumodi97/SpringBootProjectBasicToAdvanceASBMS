package com.dipu.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MotorImplementationBeanLifeCycle implements InitializingBean,DisposableBean{

	public MotorImplementationBeanLifeCycle() {
		System.out.println("Motor1.Motor1() :: 0-Param Constructor ");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Motor Started....");
		
	}
	
	public void doWork() {
		System.out.println("Motor Pulling Water...");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Motor Stopped....");
		
	}
}
