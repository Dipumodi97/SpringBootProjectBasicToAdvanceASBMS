package com.dipu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {

	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg(@RequestParam String name) {
		
		String text = name+ " , Welcome to My World";
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("msg", text);
		
		modelAndView.setViewName("index");
		
		return modelAndView;
	}
	
	/**
	 * In Model One data is send server to client.
	 * So , it's best approach
	 * 
	 * @param name
	 * @param model
	 * @return
	 */
	
	@GetMapping("/greet")
	public String getGretMsg(@RequestParam String name,Model model) {
		
		model.addAttribute("msg",name+" , Radhe Radhe...!! ");
		
		return "index";
	}
}
