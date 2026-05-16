package com.dipu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller//represents  Java class as Spring bean and send HTTP Request to handle request
public class WelcomeController {

	@GetMapping("/welcome")
	public  ModelAndView getWelcomeMsg() {
		
		ModelAndView modelAndView = new ModelAndView();
		
		/*
		 *  setting the data in ModelAndView. Model represents
		 *  data in the form of Key-Value
		 *  
		 *  while View represents logical file
		 */
		 
		modelAndView.addObject("msg", "Welcome Dipu ");
		// to set view name
		modelAndView.setViewName("index");
		
		return modelAndView;
	}
	
	@GetMapping("/greet")
	public  ModelAndView getgreetMsg() {
		
		ModelAndView modelAndView = new ModelAndView();
		
		/*
		 *  setting the data in ModelAndView. Model represents
		 *  data in the form of Key-Value
		 *  
		 *  while View represents logical file
		 */
		 
		modelAndView.addObject("msg", "Good Morning Baby... ");
		// to set view name
		modelAndView.setViewName("index");
		
		return modelAndView;
	}
}
