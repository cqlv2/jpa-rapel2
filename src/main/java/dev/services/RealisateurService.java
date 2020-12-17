package dev.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.dto.realisateur.RealisateurDtoQuery;
import dev.dto.realisateur.RealisateurDtoRep;
import dev.entities.Film;
import dev.entities.Realisateur;
import dev.exception.RepoException;
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
	public Realisateur findEntityById(int id) throws RepoException {
		Optional<Realisateur> r = realRepo.findById(id);
		if(r.isPresent()) {
			return r.get();
		}else throw new RepoException("id introuvable");
	}

	@Override
	public RealisateurDtoRep addUpdate(RealisateurDtoQuery query) {
		Realisateur r=this.dtoToEntity(query);
		realRepo.save(r);
		return this.entityToDto(r);
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
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
		Realisateur r =new Realisateur();
		if(query.getId()!=null) {
			r.setId(query.getId());
		}
		
		r.setNom(query.getNom());
		r.setPrenom(query.getPrenom());
		//r.setAdresse(adresse);
		r.setCommition(query.getCommission());
		//r.setFilms(films);
		return r;

		
		
		
	}

}
