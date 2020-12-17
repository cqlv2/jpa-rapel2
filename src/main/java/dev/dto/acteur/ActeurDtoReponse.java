package dev.dto.acteur;

import java.util.List;

import dev.dto.IntervenantDtoRep;
import dev.dto.film.FilmDtoReponse;
import dev.entities.Film;

public class ActeurDtoReponse extends IntervenantDtoRep{

	private String agence;
	private double salaire;


	
	public String getAgence() {
		return agence;
	}
	public void setAgence(String agence) {
		this.agence = agence;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double d) {
		this.salaire = d;
	}
	
	
}
