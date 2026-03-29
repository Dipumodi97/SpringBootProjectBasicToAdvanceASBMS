package com.dipu.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class MotorAnnotationBasedApproach{

	public MotorAnnotationBasedApproach() {
		System.out.println("Motor1.Motor1() :: 0-Param Constructor ");
	}

	@PostConstruct
	public void start() {
		System.out.println("Motor Started....");
		
	}
	
	public void doWork() {
		System.out.println("Motor Pulling Water...");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Motor Stopped....");
		
	}
}
