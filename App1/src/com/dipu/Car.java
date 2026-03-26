package com.dipu;

// tightly coupled with Engine

// IS-A Approach -> Not Recommended
public class Car extends Engine {

	// IS-A Relation
	public void drive() {
		
		// Start the Engine
		
		int start = super.start();

		if (start >= 1) {
			System.out.println("Journey Started...");
		}
		// Start the Journey
	}
}