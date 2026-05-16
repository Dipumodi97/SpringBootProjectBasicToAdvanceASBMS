package com.dipu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

	// it's Request Parameter also called Query Parameter
	
	/**
	 *  it represents jsp page is downloaded not show  in web page .
	 *  so we have to add the dependency tomcat-embed-jasper dependency.
	 * @param name
	 * @return
	 */
	
	// http://localhost:9091/webapp/msg?name=Dipu
	@GetMapping("/msg")
    public ModelAndView getMsg(@RequestParam String name) {
		
		String msgTxt = name + " , Good Morning ";
		
		ModelAndView modelAndView  = new ModelAndView();
		
		modelAndView.addObject("msg", msgTxt);
		
		modelAndView.setViewName("index");
		
		return modelAndView;
	}
	
	// http://localhost:9091/webapp/book?name=Dark-Horse&author=Nilotpal
	@GetMapping("/book")
    public ModelAndView getBookData(@RequestParam String name, String author) {
		
		System.out.println("Name :: "+ name);
		System.out.println("Author :: "+ author);
		
		//String msgTxt = name + " , Good Morning ";
		
		ModelAndView modelAndView  = new ModelAndView();
		
		modelAndView.addObject("msg",name+" by "+author+  "  is  out of stock");
		
		modelAndView.setViewName("index");
		
		return modelAndView;
	}
}
