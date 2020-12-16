package dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entities.Tache;

public interface tacheRepository extends JpaRepository<Tache, Integer>{

}
