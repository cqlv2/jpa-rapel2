package dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entities.Producteur;

public interface ProducteurRepository extends JpaRepository<Producteur, Integer>{

}
