package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	/**
	 * Greeting Methode.
	 * 
	 * @param name  Name
	 * @param model Model
	 * @return Path
	 */
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") final String name,
			final Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
}
