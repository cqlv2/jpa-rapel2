package dev.dto.film;

import java.util.ArrayList;
import java.util.List;

import dev.dto.IntervenantDtoRep;
import dev.dto.acteur.ActeurDtoReponse;
import dev.dto.producteur.ProducteurDtoRep;
import dev.dto.realisateur.RealisateurDtoRep;
import dev.dto.tache.TacheDtoRep;

public class FilmDtoReponse {

	private Integer id;
	private String titre;
	private int annee_sortie;
	private String catégorie;
	private List<IntervenantDtoRep> intervenants = new ArrayList<IntervenantDtoRep>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getAnnee_sortie() {
		return annee_sortie;
	}

	public void setAnnee_sortie(int annee_sortie) {
		this.annee_sortie = annee_sortie;
	}

	public String getCatégorie() {
		return catégorie;
	}

	public void setCatégorie(String catégorie) {
		this.catégorie = catégorie;
	}

	public List<IntervenantDtoRep> getIntervenants() {
		return intervenants;
	}

	public void setIntervenants(List<IntervenantDtoRep> intervenants) {
		this.intervenants = intervenants;
	}

}
