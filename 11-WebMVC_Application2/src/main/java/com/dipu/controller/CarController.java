package com.dipu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {

	// http://localhost:9091/webapp/car/150/hyd
	
	@GetMapping("/car/{carId}/hyd")
	public ModelAndView getCarColor(@PathVariable Integer carId) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		String color = null;
		
		if(carId >=100) {
			color = "Red";
		}else {
			color = "Black";
		}
		
		modelAndView.addObject("msg", "Car  color is :: "+color);
		
		modelAndView.setViewName("index");
		
		return modelAndView;
	}
	
	// http://localhost:9091/webapp/stock/benz/location/Hyd
	
	@GetMapping("/stock/{brand}/location/{location}")
	public ModelAndView getCarStock(@PathVariable String brand,@PathVariable String location) {
		
		ModelAndView modelAndView = new ModelAndView();
				
		modelAndView.addObject("msg", "In "+location+" "+brand+" car is out of stock");
		
		modelAndView.setViewName("index");
		
		return modelAndView;
	}
}
