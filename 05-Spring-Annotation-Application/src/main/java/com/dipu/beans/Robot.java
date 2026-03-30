package com.dipu.beans;

// It's Normal Java class .It's not created by Spring Bean.
// So IOC not created Object.
public class Robot {

	public Robot() {
		System.out.println("Robot.Robot() :: Constructor ");
	}
}
