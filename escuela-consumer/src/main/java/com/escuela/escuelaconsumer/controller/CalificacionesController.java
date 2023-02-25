package com.escuela.escuelaconsumer.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.escuela.escuelaconsumer.service.CalificacionesService;
import com.escuela.escuelaconsumer.servlet.response.CalificacionesResponse;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/v1/")
public class CalificacionesController {

	
	private final CalificacionesService calificacionesService;
	
	public CalificacionesController(CalificacionesService calificacionesService) {
		this.calificacionesService=calificacionesService;
	}
	
	@GetMapping("/employees")
	public  ResponseEntity<CalificacionesResponse> getAllEmployees(){
		return ResponseEntity.ok(calificacionesService.getAllCalificaciones());
	}

	
	
}

