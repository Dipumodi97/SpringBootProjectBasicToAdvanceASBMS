package com.dipu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MessageController {

	@GetMapping("/welcome")
	public String getMessage() {
		
		return "Welcome to IT Hub";
	}
	
	@GetMapping("/greet")
	public String getGreetMessage() {
		
		return "Good Morning Love...!!!";
	}
}
