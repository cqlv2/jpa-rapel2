package dev.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.dto.categorie.CategorieDtoQuery;
import dev.dto.categorie.CategorieDtoRep;
import dev.entities.Categorie;
import dev.exception.RepoException;
import dev.interfaces.ServicesInterface;
import dev.repositories.CategorieRepository;

@Service
public class CategorieService implements ServicesInterface<Categorie, CategorieDtoRep, CategorieDtoQuery>{

	private CategorieRepository catRepo;
	
	
	
	public CategorieService(CategorieRepository catRepo) {
		super();
		this.catRepo = catRepo;
	}

	@Override
	public List<CategorieDtoRep> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie findEntityById(int id) throws RepoException {
		Optional<Categorie> c = catRepo.findById(id);
		if(c.isPresent()) {
			return c.get();
		}else throw new RepoException("id introuvable");
	}

	@Override
	public CategorieDtoRep addUpdate(CategorieDtoQuery dtoQuery) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategorieDtoRep entityToDto(Categorie entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie dtoToEntity(CategorieDtoQuery query) throws RepoException {
		// TODO Auto-generated method stub
		return null;
	}

}
