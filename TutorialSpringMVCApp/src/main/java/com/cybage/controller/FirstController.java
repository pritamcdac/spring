package com.cybage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	// @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
	@GetMapping
	public String greet() {

		return "greet";
	}
	
	@GetMapping("/welcome")
	public ModelAndView welcome() {
		String name = "Tipu";

		return new ModelAndView("welcome", "userName", name);
	}

}
