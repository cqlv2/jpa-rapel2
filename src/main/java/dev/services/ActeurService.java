package dev.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.dto.acteur.ActeurDtoQuery;
import dev.dto.acteur.ActeurDtoReponse;
import dev.entities.Acteur;
import dev.interfaces.ServicesInterface;
import dev.repositories.acteurRepository;

@Service
public class ActeurService implements ServicesInterface<Acteur, ActeurDtoReponse, ActeurDtoQuery>{

	
	private acteurRepository acteurRepo;
	
	
	
	public ActeurService(acteurRepository acteurRepo) {
		super();
		this.acteurRepo = acteurRepo;
	}

	@Override
	public List<ActeurDtoReponse> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActeurDtoReponse readById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActeurDtoReponse addUpdate(Acteur entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Acteur entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ActeurDtoReponse entityToDto(Acteur entity) {
		ActeurDtoReponse dto=new ActeurDtoReponse();
		dto.setAdresse(entity.getAdresse());
		dto.setAgence(entity.getAgence());
		
		dto.setId(entity.getId());
		dto.setNom(entity.getNom());
		dto.setPrenom(entity.getPrenom());
		dto.setSalaire(entity.getSalaire());
		return dto;
	}

	@Override
	public Acteur dtoToEntity(ActeurDtoQuery query) {
		// TODO Auto-generated method stub
		return null;
	}

}
