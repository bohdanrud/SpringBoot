package ua.logos.service;

import java.util.List;

import ua.logos.entity.Film;

public interface FilmService {
	
	void saveFilm(Film film);
	
	Film findFilmById(int id);
	
	List<Film> findAllFilms();
}
