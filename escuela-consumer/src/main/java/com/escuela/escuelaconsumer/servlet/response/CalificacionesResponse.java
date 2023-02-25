package com.escuela.escuelaconsumer.servlet.response;



public class CalificacionesResponse {

	private long id_t_usuario;
	private String nombre;
	private String apellido;
	private String materia;
	private String fecha_registro;
	private Double calificacion;
	
	
	
	public Double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}
	public long getId_t_usuario() {
		return id_t_usuario;
	}
	public void setId_t_usuario(long id_t_usuario) {
		this.id_t_usuario = id_t_usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	@Override
	public String toString() {
		return "CalificacionesResponse [id_t_usuario=" + id_t_usuario + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", materia=" + materia + ", fecha_registro=" + fecha_registro + ", calificacion=" + calificacion
				+ "]";
	}
	
	
	
	
	
	
}
