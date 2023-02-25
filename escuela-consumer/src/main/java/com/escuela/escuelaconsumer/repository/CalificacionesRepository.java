package com.escuela.escuelaconsumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.escuela.escuelaconsumer.model.Calificaciones;

@Repository
public interface CalificacionesRepository extends JpaRepository<Calificaciones, Long>{

}
