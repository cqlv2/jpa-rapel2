package dev.dto.producteur;

import java.util.List;

import dev.dto.IntervenantDtoRep;
import dev.dto.film.FilmDtoReponse;

public class ProducteurDtoRep extends IntervenantDtoRep {

	private double budget;
	List<FilmDtoReponse> films;

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public List<FilmDtoReponse> getFilms() {
		return films;
	}

	public void setFilms(List<FilmDtoReponse> films) {
		this.films = films;
	}

}
