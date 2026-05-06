package com.dipu.beans;

public class DieselEngine implements IEngine{

	public DieselEngine() {
		System.out.println("Diesel :: constructor");
	}
	@Override
	public int start() {
		System.out.println("Diesel Engine Started...");
		return 1;
	}

}
