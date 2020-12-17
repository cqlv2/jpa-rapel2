package dev.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titre;
	private int annee_sortie;
	@ManyToOne
	@JoinColumn(name = "id_categ")
	private Categorie categorie;
	@ManyToMany
	@JoinTable(name = "film_acteur", joinColumns = @JoinColumn(name = "id_film"), inverseJoinColumns = @JoinColumn(name = "id_acteur"))
	private List<Acteur> acteurs = new ArrayList<Acteur>();

	@ManyToMany
	@JoinTable(name = "film_producteur", joinColumns = @JoinColumn(name = "id_film"), inverseJoinColumns = @JoinColumn(name = "id_producteur"))
	private List<Producteur> producteurs = new ArrayList<Producteur>();

	@ManyToMany
	@JoinTable(name = "film_realisateur", joinColumns = @JoinColumn(name = "id_film"), inverseJoinColumns = @JoinColumn(name = "id_realisateur"))
	private List<Realisateur> realisateurs = new ArrayList<Realisateur>();

	@OneToMany
	private List<Tache> taches = new ArrayList<Tache>();

	//getteur setteur
	
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

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie cetegorie) {
		this.categorie = categorie;
	}

	public List<Acteur> getActeurs() {
		return acteurs;
	}

	public void setActeurs(List<Acteur> acteurs) {
		this.acteurs = acteurs;
	}

	public List<Producteur> getProducteurs() {
		return producteurs;
	}

	public void setProducteurs(List<Producteur> producteurs) {
		this.producteurs = producteurs;
	}

	public List<Realisateur> getRealisateurs() {
		return realisateurs;
	}

	public void setRealisateurs(List<Realisateur> realisateurs) {
		this.realisateurs = realisateurs;
	}

	public List<Tache> getTaches() {
		return taches;
	}

	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}

	

}
