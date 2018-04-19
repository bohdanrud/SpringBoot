package ua.logos.controller;

import java.util.Arrays;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import ua.logos.entity.Actor;
import ua.logos.entity.Category;
import ua.logos.entity.Film;
import ua.logos.entity.LoginData;
import ua.logos.service.ActorService;
import ua.logos.service.CategoryService;
import ua.logos.service.FilmService;
import ua.logos.service.LoginDataService;

@Controller
@RequestMapping("/filmsDatabase")
@SessionAttributes({"genders"})
public class FilmsDatabaseController {

	@Autowired
	private ActorService actorService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private FilmService filmService;
	
	@Autowired
	private LoginDataService loginDataService;
	
	@GetMapping("/add-actor")
	private String showAddActor(Model model) {
		model.addAttribute("actorModel", new Actor());
		model.addAttribute("genders", Arrays.asList("Male","Female"));
		return "filmsDatabase/add-actor";
	}
	
	@PostMapping("filmsDatabase/add-actor")
	public String saveActor(@Valid @ModelAttribute("actorModel") Actor actor, BindingResult br) {
		if(br.hasErrors()) {
			return "filmsDatabase/add-actor";
		}
		actorService.saveActor(actor);
		return "redirect:/filmsDatabase/films-home";
	}
	
	@GetMapping("/add-loginData")
	private String showLoginData(Model model) {
		model.addAttribute("loginDataModel", new LoginData());
		model.addAttribute("actors", actorService.findAllActors());
		return "filmsDatabase/add-loginData";
	}
	
	@PostMapping("filmsDatabase/add-loginData")
	public String saveLoginData(@Valid @ModelAttribute("loginDataModel") LoginData loginData, BindingResult br) {
		if(br.hasErrors()) {
			return "/filmsDatabase/add-loginData";
		}
		loginDataService.saveLoginData(loginData);
		return "redirect:/filmsDatabase/films-home";
	}
	
	@GetMapping("/add-category")
	private String showCategory(Model model) {
		model.addAttribute("categoryModel", new Category());
		return "filmsDatabase/add-category";
	}
	
	@PostMapping("filmsDatabase/add-category")
	public String saveCategory(@Valid @ModelAttribute("categoryModel") Category category, BindingResult br) {
		if(br.hasErrors()) {
			return "/filmsDatabase/add-category";
		}
		categoryService.saveCategory(category);
		return "redirect:/filmsDatabase/films-home";
	}
	
	@GetMapping("/add-film")
	private String showFilm(Model model) {
		model.addAttribute("filmModel", new Film());
		model.addAttribute("categories", categoryService.findAllCategory());
		return "filmsDatabase/add-film";
	}
	
	@PostMapping("/filmsDatabase/add-film")
	public String saveFilm(@Valid @ModelAttribute("filmModel") Film film,BindingResult br) {
		if(br.hasErrors()) {
			return "filmsDatabase/add-film";
		}
		filmService.saveFilm(film);
		return "redirect:/filmsDatabase/films-home";
	}
	
	@GetMapping("/add-film-actor")
	private String showFilmActor(Model model) {
		
		model.addAttribute("actorsList", actorService.findAllActors());
		return "filmsDatabase/add-film-actor";
	}
	
}
