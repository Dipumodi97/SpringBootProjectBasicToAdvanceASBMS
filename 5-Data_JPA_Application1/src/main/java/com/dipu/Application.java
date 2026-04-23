package com.dipu;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dipu.entity.Student;
import com.dipu.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(Application.class, args);
		
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
	    
		/*
		 * Student student = new Student(); student.setId(103); student.setName("Rama");
		 * student.setGender("Male"); student.setRank(5452l);
		 * 
		 * studentRepository.save(student);
		 */
		
		Optional<Student> optional = studentRepository.findById(103);
		
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		
		System.out.println("Record Inserted ...");
		
		Iterable<Student> findAll = studentRepository.findAll();
		
		findAll.forEach(System.out::println);
		// another way
		findAll.forEach(s-> System.out.println(s));
		
		 // Data JPA  will implement implementation class
		//System.out.println(studentRepository.getClass().getName());
	}

}
