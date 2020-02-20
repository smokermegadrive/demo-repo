package com.puestoavanzado.paises.dao;

import com.puestoavanzado.paises.entity.Paises;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="countries")
public interface PaisesDAO extends JpaRepository<Paises, Integer> {
    
}