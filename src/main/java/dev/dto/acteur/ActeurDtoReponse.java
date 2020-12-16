package dev.dto.acteur;

import java.util.List;

import dev.dto.IntervenantDto;
import dev.dto.film.FilmDtoReponse;
import dev.entities.Film;

public class ActeurDtoReponse extends IntervenantDto{

	private String agence;
	private float salaire;


	
	public String getAgence() {
		return agence;
	}
	public void setAgence(String agence) {
		this.agence = agence;
	}
	public float getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	
	
}
