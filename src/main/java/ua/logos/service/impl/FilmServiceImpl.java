package ua.logos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.logos.entity.Film;
import ua.logos.repository.FilmRepository;
import ua.logos.service.FilmService;

@Service
public class FilmServiceImpl implements FilmService {

	@Autowired
	FilmRepository filmRepository;
	
	@Override
	public void saveFilm(Film film) {
		// TODO Auto-generated method stub
		filmRepository.save(film);
	}

	@Override
	public Film findFilmById(int id) {
		// TODO Auto-generated method stub
		return filmRepository.getOne(id);
	}

	@Override
	public List<Film> findAllFilms() {
		// TODO Auto-generated method stub
		return filmRepository.findAll();
	}

}
