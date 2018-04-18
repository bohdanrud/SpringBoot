package ua.logos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.logos.entity.Film;

public interface FilmRepository extends JpaRepository<Film, Integer> {

}
