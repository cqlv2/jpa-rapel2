package dev.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.dto.tache.TacheDtoQuery;
import dev.dto.tache.TacheDtoRep;
import dev.entities.Tache;
import dev.interfaces.ServicesInterface;
import dev.repositories.tacheRepository;

@Service
public class TacheSercice implements ServicesInterface<Tache, TacheDtoRep, TacheDtoQuery>{

	private tacheRepository tacheRepo;
	
	public TacheSercice(tacheRepository tacheRepo) {
		super();
		this.tacheRepo = tacheRepo;
	}

	@Override
	public List<TacheDtoRep> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TacheDtoRep readById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TacheDtoRep addUpdate(Tache entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Tache entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TacheDtoRep entityToDto(Tache entity) {
		TacheDtoRep dto=new TacheDtoRep();
		dto.setId(entity.getId());
		dto.setDestription(entity.getDestription());
		dto.setDate(entity.getDate());
		//dto.setDateEcheance(dateEcheance);
		return dto;
	}

	@Override
	public Tache dtoToEntity(TacheDtoQuery query) {
		// TODO Auto-generated method stub
		return null;
	}

}
