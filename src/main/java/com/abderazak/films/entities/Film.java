package com.abderazak.films.entities;
import jakarta.persistence.Entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Film {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFilm;
	private String nomFilm;
	private double rateFilm;
	private Date dateSortie;
	
	
//	private String imagePath;
	
	@ManyToOne
	private Genre genre;
	
//	 @OneToOne
//	 private Image image;

	 @OneToMany (mappedBy = "film")
	 private List<Image> images;
	
//	public Image getImage() {
//		return image;
//	}
//
//	public void setImage(Image image) {
//		this.image = image;
//	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public Film(String nomFilm, float rateFilm, String genre, Date dateSortie) {
		super();
		this.nomFilm = nomFilm;
		this.rateFilm = rateFilm;
		this.dateSortie = dateSortie;
	}

	public Film() {
		super();
		
	}
	
	@Override
	public String toString() {
		return "Film [idFilm=" + idFilm + ", nomFilm=" + nomFilm + ", rateFilm=" + rateFilm +  "]";
	}
	public Long getIdFilm() {
		return idFilm;
	}
	public void setIdFilm(Long idFilm) {
		this.idFilm = idFilm;
	}
	public String getNomFilm() {
		return nomFilm;
	}
	public void setNomFilm(String nomFilm) {
		this.nomFilm = nomFilm;
	}
	public double getRateFilm() {
		return rateFilm;
	}
	public void setRateFilm(double d) {
		this.rateFilm = d;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public Date getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

//	public String getImagePath() {
//		return imagePath;
//	}
//
//	public void setImagePath(String imagePath) {
//		this.imagePath = imagePath;
//	}
//	
	

	
}
