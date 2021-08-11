package com.comment.demo.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comvenio")
public class Comvenio implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name = "tipo_A")
	private Double tipoA;
	
	@Column(name = "tipo_B")
	private Double tipoB;

	public Comvenio() {
		
	}

	public Comvenio(Long id, Double tipoA, Double tipoB) {
		super();
		this.id = id;
		this.tipoA = tipoA;
		this.tipoB = tipoB;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getTipoA() {
		return tipoA;
	}

	public void setTipoA(Double tipoA) {
		this.tipoA = tipoA;
	}

	public Double getTipoB() {
		return tipoB;
	}

	public void setTipoB(Double tipoB) {
		this.tipoB = tipoB;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	

}
