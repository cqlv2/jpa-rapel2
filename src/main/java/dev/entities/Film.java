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
import javax.persistence.OneToOne;

@Entity
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titre;
	private int annee_sortie;
	@ManyToOne
	@JoinColumn(name = "id_categ")
	private Categorie catégorie;
	@ManyToMany
	@JoinTable(name = "film_acteur", joinColumns = @JoinColumn(name = "id_film"), inverseJoinColumns = @JoinColumn(name = "id_acteur"))
	private List<Acteur> acteurs = new ArrayList<Acteur>();

	@ManyToMany
	@JoinTable(name = "film_producteur", joinColumns = @JoinColumn(name = "id_film"), inverseJoinColumns = @JoinColumn(name = "id_producteur"))
	private List<Producteur> producteurs = new ArrayList<Producteur>();
	
	@ManyToMany
	@JoinTable(name = "film_realisateur", joinColumns = @JoinColumn(name = "id_film"), inverseJoinColumns = @JoinColumn(name = "id_realisateur"))
	private List<Realisateur> realisateurs = new ArrayList<Realisateur>();
	
	@ManyToOne
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

	public int getAnneeSortie() {
		return annee_sortie;
	}

	public void setAnneeSortie(int i) {
		this.annee_sortie = i;
	}

	public Categorie getCatégorie() {
		return catégorie;
	}

	public void setCatégorie(Categorie catégorie) {
		this.catégorie = catégorie;
	}

	public List<Acteur> getActeurs() {
		return acteurs;
	}

	public void setActeurs(List<Acteur> acteurs) {
		this.acteurs = acteurs;
	}

}
