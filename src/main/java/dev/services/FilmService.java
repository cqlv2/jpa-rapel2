package dev.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.dto.film.FilmDtoQuery;
import dev.dto.film.FilmDtoReponse;
import dev.entities.Film;
import dev.entities.Intervenant;
import dev.exception.RepoException;
import dev.interfaces.ServicesInterface;
import dev.repositories.FilmRepository;

@Service
public class FilmService implements ServicesInterface<Film, FilmDtoReponse, FilmDtoQuery> {

	private FilmRepository filmRepo;
	private IntervenantService interService;
	private TacheSercice tacheService;
	private CategorieService catService;

	public FilmService(FilmRepository filmRepo, CategorieService catService,IntervenantService interService) {
		this.filmRepo = filmRepo;
		this.tacheService = tacheService;
		this.catService = catService;
		this.interService=interService;
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

	public List<FilmDtoReponse> findBy(String type, String search) throws RepoException {
		List<FilmDtoReponse> list = new ArrayList<FilmDtoReponse>();
		switch (type) {
		// recherche par titre exact
		case "titre":
			for (Film film : filmRepo.findByTitre(search)) {
				list.add(this.entityToDto(film));
			}
			break;
		// recherche par titre resemblant
		case "titreLike":
			for (Film film : filmRepo.findByTitreContaining(search)) {
				list.add(this.entityToDto(film));
			}
			break;

		// recherche par categorie
		case "categorie":
			for (Film film : filmRepo.findByCategorie(search)) {
				list.add(this.entityToDto(film));
			}
			break;

		default:
			throw new RepoException("type de recherche invalid");
		}
		return list;

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
		Optional<Film> f = filmRepo.findById(id);
		if (f.isPresent()) {
			this.filmRepo.delete(f.get());
			return f.get().getTitre() + "a été supprimé !";
		} else
			throw new RepoException("suppr impossible id non trouvé !");
	}

	@Override
	public FilmDtoReponse entityToDto(Film entity) {
		FilmDtoReponse dto = new FilmDtoReponse();
		dto.setId(entity.getId());
		dto.setTitre(entity.getTitre());
		dto.setAnnee_sortie(entity.getAnnee_sortie());
		dto.setCatégorie(entity.getCategorie().getNom());

		for (Intervenant i : entity.getIntervenants()) {
			dto.getIntervenants().add(interService.entityToDto(i));
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
		f.setCategorie(catService.findEntityById(query.getCategorieId()));
		for (int id : query.getIntervenantsId()) {
			f.getIntervenants().add(interService.findEntityById(id));
		}
		
		return f;
	}

}
