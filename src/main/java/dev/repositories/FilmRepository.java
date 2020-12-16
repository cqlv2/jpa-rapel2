package dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entities.Film;

public interface FilmRepository extends JpaRepository<Film, Integer> {

}
