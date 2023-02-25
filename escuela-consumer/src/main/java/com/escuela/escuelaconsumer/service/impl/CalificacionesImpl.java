package com.escuela.escuelaconsumer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escuela.escuelaconsumer.mapper.CalificacionesMapper;
import com.escuela.escuelaconsumer.model.Calificaciones;
import com.escuela.escuelaconsumer.repository.CalificacionesRepository;
import com.escuela.escuelaconsumer.service.CalificacionesService;
import com.escuela.escuelaconsumer.servlet.response.CalificacionesResponse;

@Service
public class CalificacionesImpl implements CalificacionesService {

	@Autowired
	private CalificacionesRepository calificacionesRepository;
	
	@Override
	public  CalificacionesResponse  getAllCalificaciones() {
		
		List<Calificaciones> listCalificaciones = calificacionesRepository.findAll();
		if (listCalificaciones.isEmpty()) {
			return null;
		}
			
		return new CalificacionesMapper().mapResponseCalificaciones(calificacionesRepository.findAll());
	}

	
}
