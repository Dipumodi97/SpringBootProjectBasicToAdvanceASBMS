package com.dipu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@ResponseBody
public class MessageController {

	@GetMapping("/welcome")
	@ResponseBody
	public String getWelcomeMessage() {

		String msg = "Welcome to Future";

		return msg;
	}

	@GetMapping("/greet")
	@ResponseBody
	public String getGreetMessage() {

		String msg = "Good Morning Bably...";
		
		int i = 10/0;

		return msg;
	}

	@ExceptionHandler(value = ArithmeticException.class)
	public ModelAndView handleArithmeticException(ArithmeticException arithmeticException) {

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("error");

		return modelAndView;
	}
}
