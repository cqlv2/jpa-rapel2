package dev.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.dto.realisateur.RealisateurDtoQuery;
import dev.dto.realisateur.RealisateurDtoRep;
import dev.entities.Film;
import dev.entities.Realisateur;
import dev.interfaces.ServicesInterface;
import dev.repositories.RealisateurRepository;

@Service
public class RealisateurService implements ServicesInterface<Realisateur, RealisateurDtoRep, RealisateurDtoQuery>{

	RealisateurRepository realRepo;
	
	public RealisateurService(RealisateurRepository realRepo) {
		super();
		this.realRepo = realRepo;
	}

	@Override
	public List<RealisateurDtoRep> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RealisateurDtoRep readById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RealisateurDtoRep addUpdate(Realisateur entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Realisateur entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RealisateurDtoRep entityToDto(Realisateur entity) {
		RealisateurDtoRep dto = new RealisateurDtoRep();
		
		dto.setAdresse(entity.getAdresse());
		dto.setCommition(entity.getCommition());
		
		dto.setId(entity.getId());
		dto.setNom(entity.getNom());
		dto.setPrenom(entity.getPrenom());
		
		
		return dto;
	}

	@Override
	public Realisateur dtoToEntity(RealisateurDtoQuery query) {
		// TODO Auto-generated method stub
		return null;
	}

}
