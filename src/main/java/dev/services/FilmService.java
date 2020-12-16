package dev.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.dto.film.FilmDtoQuery;
import dev.dto.film.FilmDtoReponse;
import dev.entities.Acteur;
import dev.entities.Film;
import dev.entities.Producteur;
import dev.entities.Realisateur;
import dev.entities.Tache;
import dev.interfaces.ServicesInterface;
import dev.repositories.FilmRepository;

@Service
public class FilmService implements ServicesInterface<Film, FilmDtoReponse, FilmDtoQuery>{

	private FilmRepository filmRepo;
	private ActeurService acteurService;
	private ProducteurService prodService;
	private RealisateurService realService;
	private TacheSercice tacheService;
	
	
	public FilmService(FilmRepository filmRepo,ActeurService acteurService,ProducteurService prodService, RealisateurService realService,TacheSercice tacheService) {
		this.filmRepo = filmRepo;
		this.acteurService=acteurService;
		this.prodService=prodService;
		this.realService=realService;
		this.tacheService=tacheService;
	}


	@Override
	public List<FilmDtoReponse> readAll() {		
		List<FilmDtoReponse> list=new ArrayList<FilmDtoReponse>();
		for (Film f : this.filmRepo.findAll()) {
			list.add(this.entityToDto(f));
		}
		return list;
	}
	
	public List<Film> test() {		
		return this.filmRepo.findAll();
	}

	@Override
	public FilmDtoReponse readById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FilmDtoReponse addUpdate(Film entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Film entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FilmDtoReponse entityToDto(Film entity) {
		FilmDtoReponse dto=new FilmDtoReponse();
		dto.setId(entity.getId());
		dto.setTitre(entity.getTitre());
		dto.setAnnee_sortie(entity.getAnnee_sortie());
		dto.setCatégorie(entity.getCatégorie().getNom());
		
		for (Acteur a : entity.getActeurs()) {
			dto.getActeurs().add(acteurService.entityToDto(a));
		}
		
		for (Producteur p : entity.getProducteurs()) {
			dto.getProducteurs().add(prodService.entityToDto(p));
		}
		
		for (Realisateur r : entity.getRealisateurs()) {
			dto.getRealisateurs().add(realService.entityToDto(r));
		}
		
		for (Tache t : entity.getTaches()) {
			dto.getTaches().add(tacheService.entityToDto(t));
		}
		return dto;
	}

	@Override
	public Film dtoToEntity(FilmDtoQuery query) {
		// TODO Auto-generated method stub
		return null;
	}

}
