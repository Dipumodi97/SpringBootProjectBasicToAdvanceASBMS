package com.dipu;

//HAS-A Approach -> Not Recommended, Because 
// when we create a constructor to pass the argument then Object class will affect.
public class Car1 {

	// HAS-A Relation
	public void drive() {
		
		Engine engine = new Engine();
		
		// Start the Engine
		int start = engine.start();
		
		if(start >= 1) {
			System.out.println("Journey Started...");
		}
		
		// Start the Journey
	}
}
