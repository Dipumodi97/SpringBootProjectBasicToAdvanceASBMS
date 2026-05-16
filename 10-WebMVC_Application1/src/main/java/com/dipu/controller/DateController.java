package com.dipu.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DateController {

	@GetMapping("/date")
	public ModelAndView getExactDate() {
		
		ModelAndView modelAndView = new ModelAndView();
		
		LocalDateTime dateTime = LocalDateTime.now();
		
		modelAndView.addObject("msg", "Today Date Is  :: "+dateTime);
		
		modelAndView.setViewName("index");
		
		return modelAndView;
	}
}
