package dev.dto.categorie;

import java.time.LocalDate;

public class CategorieDtoRep {

	private Integer id;
	private String nom;
	private LocalDate date_maj;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public LocalDate getDate_maj() {
		return date_maj;
	}

	public void setDate_maj(LocalDate date_maj) {
		this.date_maj = date_maj;
	}

}
