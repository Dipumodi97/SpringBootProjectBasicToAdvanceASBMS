package com.dipu.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dipu.bindings.Student;
import com.dipu.entity.StudentEntity;
import com.dipu.repository.StudentRepository;

@Controller
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	/**
	 * How-many Methods we need a Controller? 3 -methods
	 */
	// 1 . method to load Student Form

	@GetMapping("/")
	public String loadForm(Model model) {
		loadFormData(model);

		return "index";
	}

	// 2. Method to save student form Data
	@PostMapping("/save")
	public String handleSubmit(Student student, Model model) {

		System.out.println(student);

		// Logic to save
		StudentEntity entity = new StudentEntity();

		// copy data from binding object to entity object

		BeanUtils.copyProperties(student, entity);

		/**
		 * This Data is Expecting StudentEntity, but have to use Student Binding object
		 * but StudentRepository is expecting StudentEntity object.
		 */

		// timing is in String and String[] array format,so we have to set timings

		entity.setTimings(Arrays.toString(student.getTimings()));

		studentRepository.save(entity);
		
		model.addAttribute("msg", "Student Saved !!!");

		loadFormData(model);

		return "index";
	}

	private void loadFormData(Model model) {
		List<String> courseList = new ArrayList<>();
		courseList.add("Java");
		courseList.add("Python");
		courseList.add(".Net");
		courseList.add("DevOps");

		List<String> timingList = new ArrayList<>();
		timingList.add("Morning");
		timingList.add("AfterNoon");
		timingList.add("Evening");

		// create Student Object
		Student student1 = new Student();

		model.addAttribute("courses", courseList);
		model.addAttribute("timing", timingList);
		model.addAttribute("student", student1);
	}

	// 3. method to display saved Students Data
	@GetMapping("/viewStudents")
	public  String getAllStudentData(Model model) {
		
		List<StudentEntity> studentList = studentRepository.findAll();
		
		model.addAttribute("students", studentList);
		
		return "data";
	}
}
