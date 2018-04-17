package ua.logos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ua.logos.entity.Country;
import ua.logos.entity.Student;
import ua.logos.service.CountryService;
import ua.logos.service.StudentService;

@Controller
public class HomeController {

	@Autowired
	private CountryService countryService;
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("add-country")
	public String showAddCountry(Model model) {
		model.addAttribute("countryModel", new Country());
		
		return "add-country";
	}
	
	@PostMapping("/add-country")
	public String saveCountry(@ModelAttribute("countryModel") Country country) {
		countryService.saveCountry(country);
		return "redirect:/";
	}
	
	@GetMapping("/add-student")
	public String showAddStudent(Model model) {
		model.addAttribute("studentModel", new Student());
		model.addAttribute("countries", countryService.findAllCountries());
		
		return "";
	}
}
