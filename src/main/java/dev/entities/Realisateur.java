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
public class Realisateur extends Intervenant {

	
	private double commition;
	@ManyToMany
	@JoinTable(name = "film_realisateur", joinColumns = @JoinColumn(name = "id_realisateur"), inverseJoinColumns = @JoinColumn(name = "id_film"))
	private List<Film> films = new ArrayList<Film>();

	// getSet

	public double getCommition() {
		return commition;
	}

	public void setCommition(double commition) {
		this.commition = commition;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}
	

}
