package com.comment.demo.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "tipoMoneda")
public class TipoMoneda implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "cop")
	private Double Cop;

	@Column(name = "usd")
	private Double Usd;

	@Column(name = "eur")
	private Double Eur;

	public TipoMoneda() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoMoneda(Long id, Double cop, Double usd, Double eur) {
		super();
		this.id = id;
		Cop = cop;
		Usd = usd;
		Eur = eur;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getCop() {
		return Cop;
	}

	public void setCop(Double cop) {
		Cop = cop;
	}

	public Double getUsd() {
		return Usd;
	}

	public void setUsd(Double usd) {
		Usd = usd;
	}

	public Double getEur() {
		return Eur;
	}

	public void setEur(Double eur) {
		Eur = eur;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
