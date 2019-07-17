package com.senac.starwars.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.senac.starwars.dominio.Planeta;

@Repository
public interface PlanetaRepositorio  extends JpaRepository<Planeta, Integer>{

	Optional<Planeta> findById(Integer id);
}
