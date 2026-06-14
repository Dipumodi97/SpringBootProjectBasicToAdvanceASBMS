package com.dipu;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.dipu.entity.Product;
import com.dipu.entity.Student;
import com.dipu.repository.ProductRepository;
import com.dipu.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		// using Product Related Work
		
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		
		Product p = new Product();
		p.setProductName("VDI");
		p.setProductPrice(44554.5);
		
		productRepository.save(p);

		/*
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		
		Student s = new Student(101,"Rahul",1000654l,"Male","Y");
		studentRepository.save(s);
		
		System.out.println("Record Saved...");
		
		// Update the record of ActiveSwitch
		Student student = studentRepository.findById(101).get();
		student.setActiveSwitch("N");
		
		studentRepository.save(student);
		
		*/
		
		/*
		// Update Data from DB using Update Query in HQL
		studentRepository.insertStudent(106, "Shanu", "Female");
		
		*/
		
		/*
		// Update Data from DB using Update Query in HQL
		studentRepository.updateStudent(101, "Male");
		System.out.println("Updated  Successfully  :: ");
		
		*/
		
		            // Step-3
		/*
		// Delete Data from DB using Delete Query in HQL
		 * 
		 * if(studentRepository.existById(106){
		 
		studentRepository.deleteStudent(106);
		System.out.println("Deleted Successfully ...");
		}else{
		  System.out.println("No Data Available ...");
		
		*/
		
		// using for search Data given by Example
		/*
		Student student = new Student();
		student.setGender("male");
		
		Example<Student> students = Example.of(student);
		List<Student> list = studentRepository.findAll(students);
		list.forEach(System.out::println);
		*/
		
		/*
		List<Student> students = studentRepository.findAll(Sort.by("name").descending());
		
		students.forEach(System.out::println);
		
		*/
		
		/*
		 * List<Student> students = studentRepository.findAll();
		
		   students.forEach(System.out::println);
		*/
		
		/*
		// I'm using Page Request
		
		// Using Scanner for Dynamically Page Request
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Page Number");
		int pageNumber = sc.nextInt();
		int  pageSize = 3;
		
		PageRequest page = PageRequest.of(pageNumber-1, pageSize);
		Page<Student> findAll = studentRepository.findAll(page);
		List<Student> students = findAll.getContent();
		students.forEach(System.out::println);
		
		*/
		
		

		       // Step-2
		/*
		 Student student = new Student(); 
		 student.setId(106); 
		 student.setName("Radha");
		 student.setGender("Female"); 
		 student.setRank(5362l);
		 
		 studentRepository.save(student);
		 System.out.println("record Inserted ");
		 
		 // I want to retrieve a record then using findById(ID id) method
		Optional<Student> optional = studentRepository.findById(103);

		if (optional.isPresent()) {
			System.out.println(optional.get());
		}

		System.out.println("Record Inserted ...");

		Iterable<Student> findAll = studentRepository.findAll();

		findAll.forEach(System.out::println);
		// another way
		findAll.forEach(s -> System.out.println(s));

         // Step -1 (HikariDatasource internally working)
		// Data JPA will implement implementation class
		// System.out.println(studentRepository.getClass().getName());
		 
		 */
	}

}
