package dev.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.dto.film.FilmDtoQuery;
import dev.dto.film.FilmDtoReponse;
import dev.entities.Acteur;
import dev.entities.Film;
import dev.entities.Producteur;
import dev.entities.Realisateur;
import dev.entities.Tache;
import dev.exception.RepoException;
import dev.interfaces.ServicesInterface;
import dev.repositories.FilmRepository;

@Service
public class FilmService implements ServicesInterface<Film, FilmDtoReponse, FilmDtoQuery> {

	private FilmRepository filmRepo;
	private ActeurService acteurService;
	private ProducteurService prodService;
	private RealisateurService realService;
	private TacheSercice tacheService;
	private CategorieService catService;

	public FilmService(FilmRepository filmRepo, ActeurService acteurService, ProducteurService prodService,
			RealisateurService realService, TacheSercice tacheService, CategorieService catService) {
		this.filmRepo = filmRepo;
		this.acteurService = acteurService;
		this.prodService = prodService;
		this.realService = realService;
		this.tacheService = tacheService;
		this.catService = catService;
	}

	@Override
	public List<FilmDtoReponse> readAll() {
		List<FilmDtoReponse> list = new ArrayList<FilmDtoReponse>();
		for (Film f : this.filmRepo.findAll()) {
			list.add(this.entityToDto(f));
		}
		return list;
	}

	@Override
	public Film findEntityById(int id) throws RepoException {
		Optional<Film> f = filmRepo.findById(id);
		if (f.isPresent()) {
			return f.get();
		} else
			throw new RepoException("id introuvable");
	}

	@Override
	public FilmDtoReponse addUpdate(FilmDtoQuery dtoQuery) {
		Film f = null;
		try {
			f = this.dtoToEntity(dtoQuery);
		} catch (RepoException e) {
			e.printStackTrace();
		}
		filmRepo.save(f);
		return this.entityToDto(f);
	}

	@Override
	public String delete(Integer id) throws RepoException {
		Optional<Film> f=filmRepo.findById(id);
		if(f.isPresent()) {
			this.filmRepo.delete(f.get());
			return f.get().getTitre()+"a été supprimé !"; 
		}else throw new RepoException("suppr impossible id non trouvé !");
	}

	@Override
	public FilmDtoReponse entityToDto(Film entity) {
		FilmDtoReponse dto = new FilmDtoReponse();
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
	public Film dtoToEntity(FilmDtoQuery query) throws RepoException {
		Film f = new Film();
		if (query.getId() != null) {
			f.setId(query.getId());
		} else {
			f.setId(null);
		}
		f.setTitre(query.getTitre());
		f.setAnnee_sortie(query.getAnnee_sortie());
		f.setCatégorie(catService.findEntityById(query.getCategorieId()));
		for (int id : query.getActeursId()) {
			f.getActeurs().add(acteurService.findEntityById(id));
		}
		for (int id : query.getProducteursId()) {
			f.getProducteurs().add(prodService.findEntityById(id));
		}
		for (int id : query.getRealisateursId()) {
			f.getRealisateurs().add(realService.findEntityById(id));
		}
		for (int id : query.getTachesId()) {
			f.getTaches().add(tacheService.findEntityById(id));
		}

		return f;
	}

}
