package dev.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.dto.acteur.ActeurDtoQuery;
import dev.dto.acteur.ActeurDtoReponse;
import dev.entities.Acteur;
import dev.entities.Film;
import dev.exception.RepoException;
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
	public Acteur findEntityById(int id) throws RepoException {
		Optional<Acteur>a = acteurRepo.findById(id);
		if(a.isPresent()) {
			return a.get();
		}else throw new RepoException("id introuvable");
	}

	@Override
	public ActeurDtoReponse addUpdate(ActeurDtoQuery dtoQuery) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
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
