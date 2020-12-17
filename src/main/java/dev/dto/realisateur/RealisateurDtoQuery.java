package dev.dto.realisateur;

import dev.dto.IntervenantDtoQuery;

public class RealisateurDtoQuery extends IntervenantDtoQuery {

	private double commission;

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

}
