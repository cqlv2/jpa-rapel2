package dev.dto.realisateur;

import java.util.List;

import dev.dto.IntervenantDto;
import dev.dto.film.FilmDtoReponse;

public class RealisateurDtoRep extends IntervenantDto {

	private double commition;
	private List<FilmDtoReponse> films;

	public double getCommition() {
		return commition;
	}

	public void setCommition(double commition) {
		this.commition = commition;
	}

	public List<FilmDtoReponse> getFilms() {
		return films;
	}

	public void setFilms(List<FilmDtoReponse> films) {
		this.films = films;
	}

}
