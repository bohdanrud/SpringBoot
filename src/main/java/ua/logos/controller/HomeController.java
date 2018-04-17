package ua.logos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ua.logos.entity.Country;

@Controller
public class HomeController {

	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("add-country")
	public String showAddCountry(Model model) {
		model.addAttribute("countryModel", new Country());
		
		return " ";
	}
}
