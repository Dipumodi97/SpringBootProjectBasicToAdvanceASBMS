package com.dipu.beans;

public class PetrolEngine implements IEngine{

	public PetrolEngine() {
		System.out.println("Petrol :: constructor");
	}
	@Override
	public int start() {
		System.out.println("Petrol Engine Started...");
		return 1;
	}

	
}
