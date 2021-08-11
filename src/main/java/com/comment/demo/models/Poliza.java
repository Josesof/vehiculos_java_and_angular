package com.comment.demo.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Poliza")
public class Poliza implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name = "poliza_Basica")
	private Double polizaBasica;
	
	
	@Column(name = "poliza_Intermedia")
	private Double polizaIntermedia;
	
	@Column(name = "poliza_Premmium")
	private Double polizaPremmium;

	public Poliza() {
		
	}

	public Poliza(Long id, Double polizaBasica, Double polizaIntermedia, Double polizaPremmium) {
		super();
		this.id = id;
		this.polizaBasica = polizaBasica;
		this.polizaIntermedia = polizaIntermedia;
		this.polizaPremmium = polizaPremmium;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPolizaBasica() {
		return polizaBasica;
	}

	public void setPolizaBasica(Double polizaBasica) {
		this.polizaBasica = polizaBasica;
	}

	public Double getPolizaIntermedia() {
		return polizaIntermedia;
	}

	public void setPolizaIntermedia(Double polizaIntermedia) {
		this.polizaIntermedia = polizaIntermedia;
	}

	public Double getPolizaPremmium() {
		return polizaPremmium;
	}

	public void setPolizaPremmium(Double polizaPremmium) {
		this.polizaPremmium = polizaPremmium;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
