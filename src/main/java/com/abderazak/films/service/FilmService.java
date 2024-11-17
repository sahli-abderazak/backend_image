package com.abderazak.films.service;

import java.util.List;

import com.abderazak.films.entities.Film;
import com.abderazak.films.entities.Genre;

public interface FilmService {
	Film saveFilm(Film f);
	Film updateFilm(Film f);
	void deleteFilm(Film f);
	 void deleteFilmById(Long id);
	 Film getFilm(Long id);
	List<Film> getAllFilms();
	List<Film> findByNomFilm(String nom);
	List<Film> findByNomFilmContains(String nom);
	List<Film> findByNomRate (String nom, Double rate);
	List<Film> findByGenre (Genre genre);
	List<Film> findByGenreIdGenre(Long id);
	List<Film> findByOrderByNomFilmAsc();
	List<Film> trierFilmsnomsRates();

}
