package dev.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
@DiscriminatorValue("REALISATEUR")
public class Realisateur extends Intervenant {

	private double commition;

	public double getCommition() {
		return commition;
	}

	public void setCommition(double commition) {
		this.commition = commition;
	}

}
