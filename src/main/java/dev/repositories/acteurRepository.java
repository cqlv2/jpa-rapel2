package dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entities.Acteur;

public interface acteurRepository extends JpaRepository<Acteur, Integer> {

}
