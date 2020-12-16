package dev.dto.tache;

import java.time.LocalDate;

public class TacheDtoRep {
	private Integer id;
	private String destription;
	private LocalDate date;
	private LocalDate dateEcheance;

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

	public LocalDate getDateEcheance() {
		return dateEcheance;
	}

	public void setDateEcheance(LocalDate dateEcheance) {
		this.dateEcheance = dateEcheance;
	}

}
