package dev.dto.acteur;

import dev.dto.IntervenantDtoQuery;
import dev.dto.IntervenantDtoRep;

public class ActeurDtoQuery extends IntervenantDtoQuery {

	double salaire;
	String agence;

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public String getAgence() {
		return agence;
	}

	public void setAgence(String agence) {
		this.agence = agence;
	}

}
