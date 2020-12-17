package dev.dto;

import java.util.List;

import dev.dto.film.FilmDtoReponse;
import dev.entities.Adresse;
import dev.entities.Film;

public abstract class IntervenantDtoRep {
	private Integer id;
	private String nom;
	private String prenom;
	private Adresse adresse;
	private List<FilmDtoReponse> films;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public List<FilmDtoReponse> getFilms() {
		return films;
	}

	public void setFilms(List<FilmDtoReponse> films) {
		this.films = films;
	}

}
