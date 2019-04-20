package com.agenda.sg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "TAREAS")
public class Tarea {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "titulo_tarea")
	private String tituloTarea;
	@Column(name = "descripcion_tarea")
	private String descripcionTarea;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "persona_id")
	private Persona persona;
	
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTituloTarea() {
		return tituloTarea;
	}
	public void setTituloTarea(String tituloTarea) {
		this.tituloTarea = tituloTarea;
	}
	public String getDescripcionTarea() {
		return descripcionTarea;
	}
	public void setDescripcionTarea(String descripcioTarea) {
		this.descripcionTarea = descripcioTarea;
	}
	
	
}
