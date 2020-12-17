package dev.dto.producteur;

import dev.dto.IntervenantDtoQuery;

public class ProducteurDtoQuery extends IntervenantDtoQuery {

	private double budget;

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

}
