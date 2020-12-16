package dev.dto.film;

import java.util.ArrayList;
import java.util.List;

import dev.entities.Categorie;
import dev.entities.Tache;

public class FilmDtoQuery {

	private Integer id=null;
	private String titre;
	private int annee_sortie;
	private Categorie catégorie;
	private List<Integer> acteursId = new ArrayList<Integer>();
	private List<Integer> producteursId = new ArrayList<Integer>();
	private List<Integer> realisateursId = new ArrayList<Integer>();
	private Tache taches;
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
	public Categorie getCatégorie() {
		return catégorie;
	}
	public void setCatégorie(Categorie catégorie) {
		this.catégorie = catégorie;
	}
	public List<Integer> getActeursId() {
		return acteursId;
	}
	public void setActeursId(List<Integer> acteursId) {
		this.acteursId = acteursId;
	}
	public List<Integer> getProducteursId() {
		return producteursId;
	}
	public void setProducteursId(List<Integer> producteursId) {
		this.producteursId = producteursId;
	}
	public List<Integer> getRealisateursId() {
		return realisateursId;
	}
	public void setRealisateursId(List<Integer> realisateursId) {
		this.realisateursId = realisateursId;
	}
	public Tache getTaches() {
		return taches;
	}
	public void setTaches(Tache taches) {
		this.taches = taches;
	}
	
}
