package ua.logos.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import ua.logos.entity.Country;
import ua.logos.entity.Student;
import ua.logos.service.CountryService;
import ua.logos.service.StudentService;

@Controller
@SessionAttributes({"countries"})
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
	public String saveCountry(@Valid @ModelAttribute("countryModel") Country country, BindingResult br) {
		if(br.hasErrors()) {
			return "add-country";
		}
		countryService.saveCountry(country);
		return "redirect:/";
	}
	
	@GetMapping("/add-student")
	public String showAddStudent(Model model) {
		model.addAttribute("studentModel", new Student());
		model.addAttribute("countries", countryService.findAllCountries());
		
		return "add-student";
	}
	
	@PostMapping("/add-student")
	public String saveStudent(@Valid @ModelAttribute("studentModel") Student student, BindingResult br) {
		if(br.hasErrors()) {
			return "add-student";
		}
		studentService.saveStudent(student);
		return "redirect:/";
	}
	
	@GetMapping("/filmsDatabase/films-home")
	public String showFilmsDatabaseHome() {
		return "/filmsDatabase/films-home";
	}
	
	@GetMapping("/students")
	public String showAllStudents(Model model) {
		model.addAttribute("studentsList", studentService.findAllStudents());
		return "";
	}
	
	@GetMapping("/generate/random")
	public String generateStudents() {
		for(int i = 0; i<=500; i++) {
			Student student = new Student();
			student.setFullName("Student" + i + "Full" + (i-1) + " " + "Name#" + i);
			student.setAge(35);
			student.setEmail("stugent@gmail.com");
			
			Country country = new Country();
			country.setName("Country#" + i);
			countryService.saveCountry(country);
			
			student.setCountry(country);
			studentService.saveStudent(student);
		}
		return "redirect:/";
	}
}
