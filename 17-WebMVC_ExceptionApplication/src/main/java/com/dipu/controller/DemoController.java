package com.dipu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	@GetMapping("/demo")
	@ResponseBody
	public String getDemoMsg() {
		
		String msg = "Hello Julie....";
		
		int i = 10/0;
		
		return msg;
	}
}
