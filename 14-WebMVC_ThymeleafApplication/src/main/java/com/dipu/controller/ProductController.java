package com.dipu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dipu.binding.Product;

@Controller
public class ProductController {

	// method to Display Form
	@GetMapping("/")
	public String loadForm(Model model) {
		
		model.addAttribute("product", new Product());
		
		return "index";
	}
	
	// method to handle Form Submission
	@PostMapping("/product")
	public String handleSubmitButton(Product product, Model model) {
		
		System.out.println(product);
		
		model.addAttribute("msg", "Product Saved !!!");
		
		return "index";
	}
	
}
