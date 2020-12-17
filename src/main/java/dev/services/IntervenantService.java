package dev.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.dto.IntervenantDtoQuery;
import dev.dto.IntervenantDtoRep;
import dev.entities.Intervenant;
import dev.exception.RepoException;
import dev.interfaces.ServicesInterface;

@Service
public class IntervenantService implements ServicesInterface<Intervenant, IntervenantDtoRep, IntervenantDtoQuery>{

	@Override
	public List<IntervenantDtoRep> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Intervenant findEntityById(int id) throws RepoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IntervenantDtoRep addUpdate(IntervenantDtoQuery dtoQuery) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) throws RepoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IntervenantDtoRep entityToDto(Intervenant entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Intervenant dtoToEntity(IntervenantDtoQuery query) throws RepoException {
		// TODO Auto-generated method stub
		return null;
	}

}
