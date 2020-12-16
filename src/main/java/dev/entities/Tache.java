package dev.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Tache {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String destription;
	private LocalDate date;
	
	@OneToOne
	private DateEcheance dateEcheance;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDestription() {
		return destription;
	}

	public void setDestription(String destription) {
		this.destription = destription;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public DateEcheance getDateEcheance() {
		return dateEcheance;
	}

	public void setDateEcheance(DateEcheance dateEcheance) {
		this.dateEcheance = dateEcheance;
	}

}
