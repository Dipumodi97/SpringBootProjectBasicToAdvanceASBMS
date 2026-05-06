package com.dipu.beans;

public class Car {

	private IEngine engine;
	
	public void setEngine(IEngine engine) {
		System.out.println("setEng() :: Setter Method called");
		this.engine = engine;
	}
	public Car() {
		System.out.println("Car :: No Param Constructor");
	}
	
	public Car(IEngine engine) {
		System.out.println("Car :: Parameterised Constructor");
		this.engine =  engine;
	}
	public void drive() {
		int start = engine.start();
		
		if(start >=1) {
			System.out.println("Journey Started...");
		}else {
			System.out.println("Trouble");
		}
	}
}
