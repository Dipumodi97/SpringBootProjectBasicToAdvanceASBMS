package com.dipu.recommended;

public class Main {

	public static void main(String[] args) {
		
		// When we pass  the argument then Default constructor not allowed
//		Car c = new Car();
//		c.drive();
		
		// Using Loosely Coupled to call the method and create the object
		Car car = new Car(new DieselEngine());
		car.drive();
		Car car1 = new Car(new PetrolEngine());
		car1.drive();
	}
}
