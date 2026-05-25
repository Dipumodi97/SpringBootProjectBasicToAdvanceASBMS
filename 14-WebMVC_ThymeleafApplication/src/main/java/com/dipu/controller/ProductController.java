package com.dipu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dipu.binding.Product;

import jakarta.validation.Valid;

@Controller
public class ProductController {

	// method to Display Form
	@GetMapping("/")
	public String loadForm(Model model) {

		model.addAttribute("product", new Product());

		return "index";
	}

	// method to handle Form Submission
	
	/**
	 * If Validation are failed. User didn't enter the data to display error message of the 
	 * user .then we're taking one more parameter for the method is called
	 * BindingResult method. 
	 * 
	 * @param product
	 * @param bindingResult
	 * @param model
	 * @return
	 */
	@PostMapping("/product")
	public String handleSubmitButton(
			@Valid Product product, BindingResult bindingResult, Model model
			) 
	{

		System.out.println(product);

		if (bindingResult.hasErrors()) {
			return "index"; // return same page when we have any errors.
		} else {

			model.addAttribute("msg", "Product Saved !!!");
		}

		return "index";
	}

}
