package ua.logos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
		return "filmsDatabase/add-actor";
	}
	
	@PostMapping("filmsDatabase/new-actor")
	public String saveActor(@ModelAttribute("actorModel") Actor actor) {
		actorService.saveActor(actor);
		return "redirect:/filmsDatabase/films-home";
	}
	
	@GetMapping("/add-loginData")
	private String showLoginData(Model model) {
		model.addAttribute("loginDataModel", new LoginData());
		return "filmsDatabase/add-loginData";
	}
	
	@PostMapping("filmsDatabase/new-loginData")
	public String saveLoginData(@ModelAttribute("loginDataModel") LoginData loginData) {
		loginDataService.saveLoginData(loginData);
		return "redirect:/filmsDatabase/films-home";
	}
	
	@GetMapping("/add-category")
	private String showCategory(Model model) {
		model.addAttribute("categoryModel", new Category());
		return "filmsDatabase/add-category";
	}
	
	@PostMapping("filmsDatabase/new-category")
	public String saveCategory(@ModelAttribute("categoryModel") Category category) {
		categoryService.saveCategory(category);
		return "redirect:/filmsDatabase/films-home";
	}
	
	@GetMapping("/add-film")
	private String showFilm(Model model) {
		model.addAttribute("filmModel", new Film());
		return "filmsDatabase/add-film";
	}
	
	@PostMapping("filmsDatabase/new-film")
	public String saveFilm(@ModelAttribute("filmModel") Film film) {
		filmService.saveFilm(film);
		return "redirect:/filmsDatabase/films-home";
	}
	
	@GetMapping("/add-film-actor")
	private String showFilmActor() {
		return "filmsDatabase/add-film-actor";
	}
	
}
