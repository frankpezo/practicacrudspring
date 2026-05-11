package com.gibosa.practicacrud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gibosa.practicacrud.entity.PersonaEntity;

public interface PersonaRepository extends JpaRepository<PersonaEntity, Integer>{
	boolean existsByDniPersona(String dniPersona);
	Optional<PersonaEntity> findByDniPersona(String dniPersona);
}
