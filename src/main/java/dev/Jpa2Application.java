package dev;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import dev.dto.acteur.ActeurDtoReponse;
import dev.dto.film.FilmDtoQuery;
import dev.dto.film.FilmDtoReponse;
import dev.entities.Film;
import dev.services.FilmService;

@SpringBootApplication
@ComponentScan({"dev"})
@EntityScan("dev.entities")
@EnableJpaRepositories("dev.repositories")
@EnableTransactionManagement
public class Jpa2Application implements CommandLineRunner{

	@Autowired
	FilmService filmServ;
	public static void main(String[] args) {
		SpringApplication.run(Jpa2Application.class, args);

	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
	
//		recherche de tous les films
		
		//List<FilmDtoReponse> lf = filmServ.readAll();
		//for (FilmDtoReponse f : lf) {
		//	System.out.println(f.getTitre());
		//}

//		enregistrement d'un film
		
		FilmDtoQuery f= new FilmDtoQuery();
		f.setTitre("monFilm2");
		f.setAnnee_sortie(2003);
		f.getActeursId().add(1);
		f.setCategorie(1);
		f.getProducteursId().add(1);
		f.getRealisateursId().add(1);
		FilmDtoReponse filmSaved=(filmServ.addUpdate(f));
		System.out.println(filmSaved.getId());
		System.out.println(filmSaved.getTitre());
		System.out.println(filmSaved.getAnnee_sortie());
		for (ActeurDtoReponse a : filmSaved.getActeurs()) {
			System.out.println(a.getNom());
			System.out.println(a.getPrenom());
		}
		
		
		
		
//		supression d'un film
		//filmServ.delete(4);
		
		
	
	}
}
