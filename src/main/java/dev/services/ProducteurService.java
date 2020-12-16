package dev.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.dto.producteur.ProducteurDtoQuery;
import dev.dto.producteur.ProducteurDtoRep;
import dev.entities.Film;
import dev.entities.Producteur;
import dev.interfaces.ServicesInterface;
import dev.repositories.ProducteurRepository;

@Service
public class ProducteurService implements ServicesInterface<Producteur, ProducteurDtoRep, ProducteurDtoQuery>{

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
	public ProducteurDtoRep readById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProducteurDtoRep addUpdate(Producteur entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Producteur entity) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		return null;
	}

}
