package com.abderazak.films.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abderazak.films.entities.Film;
import com.abderazak.films.entities.Genre;
import com.abderazak.films.repos.FilmRepository;
import com.abderazak.films.repos.ImageRepository;

@Service
public class FilmServiceImpl implements FilmService {

	@Autowired
	FilmRepository filmRepository;

	@Autowired
	ImageRepository imageRepository;

	@Override
	public Film saveFilm(Film f) {
		return filmRepository.save(f);
	}

//	@Override
//	public Film updateFilm(Film f) {
//		return filmRepository.save(f);	
//	}

	@Override
	public Film updateFilm(Film f) {
//	Long oldProdImageId =
//	this.getFilm(f.getIdFilm()).getImage().getIdImage();
//	Long newfilmImageId = f.getImage().getIdImage();
		Film filmUpdated = filmRepository.save(f);
//	if (oldProdImageId != newfilmImageId) //si l'image a été modifiée
//	imageRepository.deleteById(oldProdImageId);
		return filmUpdated;
	}

	@Override
	public void deleteFilm(Film f) {
		filmRepository.delete(f);
	}

	@Override
	public void deleteFilmById(Long id) {
		filmRepository.deleteById(id);

	}

	@Override
	public Film getFilm(Long id) {
		return filmRepository.findById(id).get();

	}

	@Override
	public List<Film> getAllFilms() {
		return filmRepository.findAll();
	}

	@Override
	public List<Film> findByNomFilm(String nom) {
		return filmRepository.findByNomFilm(nom);
	}

	@Override
	public List<Film> findByNomFilmContains(String nom) {
		return filmRepository.findByNomFilmContains(nom);
	}

	@Override
	public List<Film> findByNomRate(String nom, Double rate) {
		return filmRepository.findByNomRate(nom, rate);
	}

	@Override
	public List<Film> findByGenre(Genre genre) {
		return filmRepository.findByGenre(genre);
	}

	@Override
	public List<Film> findByGenreIdGenre(Long id) {
		return filmRepository.findByGenreIdGenre(id);
	}

	@Override
	public List<Film> findByOrderByNomFilmAsc() {
		return filmRepository.findByOrderByNomFilmAsc();
	}

	@Override
	public List<Film> trierFilmsnomsRates() {
		return filmRepository.trierFilmsnomsRates();
	}

}
