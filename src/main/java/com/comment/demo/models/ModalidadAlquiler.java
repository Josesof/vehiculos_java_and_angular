package com.comment.demo.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "modalidad")
public class ModalidadAlquiler implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	
	@Column(name = "kilometraje")
	private String kilometraje;
	
	
	@Column(name = "dias")
	private String dias;

	public ModalidadAlquiler(){

	}


	public ModalidadAlquiler(Long id, String kilometraje, String dias) {
		this.id = id;
		this.kilometraje = kilometraje;
		this.dias = dias;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(String kilometraje) {
		this.kilometraje = kilometraje;
	}

	public String getDias() {
		return dias;
	}

	public void setDias(String dias) {
		this.dias = dias;
	}
}
