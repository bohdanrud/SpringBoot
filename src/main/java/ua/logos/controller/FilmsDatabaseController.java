package ua.logos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	private String showAddActor() {
		return "filmsDatabase/add-actor";
	}
	
	@GetMapping("/add-loginData")
	private String showLoginData() {
		return "filmsDatabase/add-loginData";
	}
	
	@GetMapping("/add-category")
	private String showCategory() {
		return "filmsDatabase/add-category";
	}
	
	@GetMapping("/add-film")
	private String showFilm() {
		return "filmsDatabase/add-film";
	}
	
	@GetMapping("/add-film-actor")
	private String showFilmActor() {
		return "filmsDatabase/add-film-actor";
	}
	
}
