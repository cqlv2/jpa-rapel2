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

@Entity
public class Producteur extends Intervenant {

	
	private double budget;
	@ManyToMany
	@JoinTable(name = "film_Producteur", joinColumns = @JoinColumn(name = "id_Producteur"), inverseJoinColumns = @JoinColumn(name = "id_film"))
	private List<Film> films = new ArrayList<Film>();

//getSet
	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}

}
