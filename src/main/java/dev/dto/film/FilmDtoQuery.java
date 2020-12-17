package dev.dto.film;

import java.util.ArrayList;
import java.util.List;

import dev.entities.Categorie;
import dev.entities.Tache;

public class FilmDtoQuery {

	private Integer id = null;
	private String titre;
	private Integer annee_sortie;
	private Integer categorieId;
	private List<Integer> intervenantsId = new ArrayList<Integer>();

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

	public void setCategorieId(Integer categorieId) {
		this.categorieId = categorieId;
	}

	public List<Integer> getIntervenantsId() {
		return intervenantsId;
	}

	public void setIntervenantsId(List<Integer> intervenantsId) {
		this.intervenantsId = intervenantsId;
	}

}
