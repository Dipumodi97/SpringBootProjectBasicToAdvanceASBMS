package com.dipu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dipu.binding.User;

@Controller
public class UserController {

	@GetMapping("/")
	public String loadForm() {
		
		return "index";
	}
	
	// Handle the submit button of post request
	@PostMapping("/user")
	public String handleSubmitButton(User user, Model model) {
		
		System.out.println("User Saved :: "+user);
		
		model.addAttribute("msg", "USER SAVED !!!");
		
		return "index";
	}
}
