package com.dipu;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dipu.entity.Address;
import com.dipu.entity.Employee;
import com.dipu.repository.AddressRepository;
import com.dipu.repository.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		
		EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
		
		AddressRepository addressRepository = context.getBean(AddressRepository.class);

		Employee employee = new Employee();
		employee.setEmpName("Rahul");
		employee.setEmpSalary(85000.879);

		Address address = new Address();
		address.setCity("Ranchi");
		address.setState("Jharkhand");
		address.setCountry("India");
		address.setEmployee(employee);
		
		Address address1 = new Address();
		address1.setCity("Koderma");
		address1.setState("Jharkhand");
		address1.setCountry("India");
		address1.setEmployee(employee);
		
		List<Address> list = Arrays.asList(address,address1);
		
		// set address to employee
		employee.setAddresses(list);
		
		//employeeRepository.save(employee);
		
		employeeRepository.findById(2);
		// Delete employee by id.
		//employeeRepository.deleteById(1);
		
		//System.out.println("Records Inserted...");;
		
		addressRepository.findById(3);
		
		
	}

}
