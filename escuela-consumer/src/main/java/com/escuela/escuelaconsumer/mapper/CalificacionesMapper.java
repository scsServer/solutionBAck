package com.escuela.escuelaconsumer.mapper;

import java.util.List;

import com.escuela.escuelaconsumer.model.Calificaciones;
import com.escuela.escuelaconsumer.servlet.response.CalificacionesResponse;

public class CalificacionesMapper{

	public CalificacionesResponse mapResponseCalificaciones(List<Calificaciones> listCalificaciones) {
		CalificacionesResponse calificacionesResponse = new CalificacionesResponse();
		calificacionesResponse.setNombre(listCalificaciones.get(0).getAlumno().getNombre());
		calificacionesResponse.setApellido(String.join(listCalificaciones.get(0).getAlumno().getAp_paterno(), " ",listCalificaciones.get(0).getAlumno().getAp_materno()) );
		calificacionesResponse.setId_t_usuario(listCalificaciones.get(0).getAlumno().getId());
		calificacionesResponse.setMateria(listCalificaciones.get(0).getMateria().getNombre());
		calificacionesResponse.setCalificacion(listCalificaciones.get(0).getCalificacion());
		calificacionesResponse.setFecha_registro(listCalificaciones.get(0).getFecha_registro().toString());
		return calificacionesResponse;
	}
}
