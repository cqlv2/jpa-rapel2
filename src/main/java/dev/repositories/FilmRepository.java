package dev.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dev.entities.Film;

public interface FilmRepository extends JpaRepository<Film, Integer> {

	List<Film> findByTitreContaining(String search);
	List<Film>findByTitre(String search);
	
	@Query("select f from Film f where f.categorie.nom=:search")
	List<Film>findByCategorie(String search);
//	List<Film>findByTitre(String search);
//	List<Film>findByTitre(String search);
	
	
	
	
	
	

}
