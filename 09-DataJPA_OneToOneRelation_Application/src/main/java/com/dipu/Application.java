package com.dipu;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dipu.entity.Passport;
import com.dipu.entity.Person;
import com.dipu.repository.PassportRepository;
import com.dipu.repository.PersonRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		PersonRepository personRepository = context.getBean(PersonRepository.class);
		
		PassportRepository passportRepository = context.getBean(PassportRepository.class);
		
		Person person = new Person();
		person.setPersonName("Dipu Kumar");
		person.setPersonGender("Male");
		
		Passport passport= new Passport();
		passport.setPassportNumber("HMLAT4863E");
		passport.setIssuedDate(LocalDate.now());
		passport.setExpiryDate(LocalDate.now().plusYears(10));
		
		person.setPassport(passport);
		passport.setPerson(person);
		
		personRepository.save(person);
	}

}
