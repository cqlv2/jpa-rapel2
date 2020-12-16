package dev.dto.film;

import java.util.ArrayList;
import java.util.List;

import dev.dto.acteur.ActeurDtoReponse;
import dev.dto.producteur.ProducteurDtoRep;
import dev.dto.realisateur.RealisateurDtoRep;
import dev.dto.tache.TacheDtoRep;

public class FilmDtoReponse {

	private Integer id;
	private String titre;
	private int annee_sortie;
	private String catégorie;
	private List<ActeurDtoReponse> acteurs = new ArrayList<ActeurDtoReponse>();
	private List<ProducteurDtoRep> producteurs = new ArrayList<ProducteurDtoRep>();
	private List<RealisateurDtoRep> realisateurs = new ArrayList<RealisateurDtoRep>();
	private List<TacheDtoRep> taches = new ArrayList<TacheDtoRep>();

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

	public List<ActeurDtoReponse> getActeurs() {
		return acteurs;
	}

	public void setActeurs(List<ActeurDtoReponse> acteurs) {
		this.acteurs = acteurs;
	}

	public List<ProducteurDtoRep> getProducteurs() {
		return producteurs;
	}

	public void setProducteurs(List<ProducteurDtoRep> producteurs) {
		this.producteurs = producteurs;
	}

	public List<RealisateurDtoRep> getRealisateurs() {
		return realisateurs;
	}

	public void setRealisateurs(List<RealisateurDtoRep> realisateurs) {
		this.realisateurs = realisateurs;
	}

	public List<TacheDtoRep> getTaches() {
		return taches;
	}

	public void setTaches(List<TacheDtoRep> taches) {
		this.taches = taches;
	}

	

}
