package dev.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.dto.producteur.ProducteurDtoQuery;
import dev.dto.producteur.ProducteurDtoRep;
import dev.entities.Film;
import dev.entities.Producteur;
import dev.entities.Realisateur;
import dev.exception.RepoException;
import dev.interfaces.ServicesInterface;
import dev.repositories.ProducteurRepository;

@Service
public class ProducteurService implements ServicesInterface<Producteur, ProducteurDtoRep, ProducteurDtoQuery> {

	private ProducteurRepository prodRepo;

	public ProducteurService(ProducteurRepository prodRepo) {
		super();
		this.prodRepo = prodRepo;
	}

	@Override
	public List<ProducteurDtoRep> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producteur findEntityById(int id) throws RepoException {
		Optional<Producteur> p = prodRepo.findById(id);
		if (p.isPresent()) {
			return p.get();
		} else
			throw new RepoException("id introuvable");
	}

	@Override
	public ProducteurDtoRep addUpdate(ProducteurDtoQuery query) {
		Producteur p = this.dtoToEntity(query);
		prodRepo.save(p);
		return this.entityToDto(p);
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProducteurDtoRep entityToDto(Producteur entity) {
		ProducteurDtoRep dto = new ProducteurDtoRep();
		dto.setAdresse(entity.getAdresse());
		dto.setBudget(entity.getBudget());

		dto.setId(entity.getId());
		dto.setNom(entity.getNom());
		dto.setPrenom(entity.getPrenom());
		return dto;
	}

	@Override
	public Producteur dtoToEntity(ProducteurDtoQuery query) {
		Producteur p = new Producteur();
		if (query.getId() != null) {
			p.setId(query.getId());
		}
		p.setNom(query.getNom());
		p.setPrenom(query.getPrenom());

		// p.setAdresse(adresseid);

		p.setBudget(query.getBudget());
//		p.setFilms(films);

		return p;
	}

}
