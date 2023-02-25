package com.escuela.escuelaconsumer.model;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "t_calificaciones")
public class Calificaciones {

	@Id
	@Column(name = "id_t_calificaciones")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_t_usuarios", referencedColumnName = "id_t_usuarios")
	private Alumnos alumno;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_t_materias", referencedColumnName = "id_t_materias")
	private Materias materia;

	@Column(name = "calificacion")
	private Double calificacion;
	
	@Column(name = "fecha_registro")
	private Date fecha_registro;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Alumnos getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumnos alumno) {
		this.alumno = alumno;
	}

	public Materias getMateria() {
		return materia;
	}

	public void setMateria(Materias materia) {
		this.materia = materia;
	}

	public Double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public Calificaciones(long id, Alumnos alumno, Materias materia, Double calificacion, Date fecha_registro) {
		super();
		this.id = id;
		this.alumno = alumno;
		this.materia = materia;
		this.calificacion = calificacion;
		this.fecha_registro = fecha_registro;
	}

	public Calificaciones() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	



}
