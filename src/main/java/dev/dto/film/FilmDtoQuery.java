package dev.dto.film;

import java.util.ArrayList;
import java.util.List;

import dev.entities.Categorie;
import dev.entities.Tache;

public class FilmDtoQuery {

	private Integer id=null;
	private String titre;
	private Integer annee_sortie;
	private Integer categorieId;
	private List<Integer> acteursId = new ArrayList<Integer>();
	private List<Integer> producteursId = new ArrayList<Integer>();
	private List<Integer> realisateursId = new ArrayList<Integer>();
	private List<Integer> tachesId= new ArrayList<Integer>();
	
	
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
	public Integer getAnnee_sortie() {
		return annee_sortie;
	}
	public void setAnnee_sortie(Integer annee_sortie) {
		this.annee_sortie = annee_sortie;
	}
	public Integer getCategorieId() {
		return categorieId;
	}
	public void setCategorie(Integer categorieId) {
		this.categorieId = categorieId;
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
	public List<Integer> getTachesId() {
		return tachesId;
	}
	public void setTaches(List<Integer> tachesId) {
		this.tachesId = tachesId;
	}
	
}
