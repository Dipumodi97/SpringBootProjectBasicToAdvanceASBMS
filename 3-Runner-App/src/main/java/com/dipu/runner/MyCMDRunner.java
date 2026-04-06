package com.dipu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCMDRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("MyCMDRunner:: run() method called ...");
		
	}

}
