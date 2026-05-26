package com.dipu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	@ResponseBody
	public String getWelcomeMsg() {

		String msg = "Welcome to IT";

		return msg;
	}

	@GetMapping("/index")
	public String getGreetMsg(Model model) {

		model.addAttribute("msg", "Good Morning Zindagi...");

		return "index";
	}
}
