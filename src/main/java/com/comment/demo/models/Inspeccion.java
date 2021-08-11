package com.comment.demo.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "inspeccion")
public class Inspeccion implements Serializable  {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre_Empleado_E")
	private String nombreEmpleadoE;
	
	@Column(name = "kilometraje_Final")
	private String kilometrajeFinal;
	
	@Column(name = "direccion_Inspeccion")
	private String direccionInspeccion;
	
	@OneToOne( fetch = FetchType.LAZY)
	private Vehiculo vehiculo;

	@OneToOne(fetch = FetchType.LAZY)
	private Cliente cliente;
	
	@OneToOne(fetch = FetchType.LAZY)
	private ActaEntrega actaentrega;

	public Inspeccion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Inspeccion(Long id, String nombreEmpleadoE, String kilometrajeFinal, String direccionInspeccion,
			Vehiculo vehiculo, Cliente cliente, ActaEntrega actaentrega) {
		super();
		this.id = id;
		this.nombreEmpleadoE = nombreEmpleadoE;
		this.kilometrajeFinal = kilometrajeFinal;
		this.direccionInspeccion = direccionInspeccion;
		this.vehiculo = vehiculo;
		this.cliente = cliente;
		this.actaentrega = actaentrega;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreEmpleadoE() {
		return nombreEmpleadoE;
	}

	public void setNombreEmpleadoE(String nombreEmpleadoE) {
		this.nombreEmpleadoE = nombreEmpleadoE;
	}

	public String getKilometrajeFinal() {
		return kilometrajeFinal;
	}

	public void setKilometrajeFinal(String kilometrajeFinal) {
		this.kilometrajeFinal = kilometrajeFinal;
	}

	public String getDireccionInspeccion() {
		return direccionInspeccion;
	}

	public void setDireccionInspeccion(String direccionInspeccion) {
		this.direccionInspeccion = direccionInspeccion;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ActaEntrega getActaentrega() {
		return actaentrega;
	}

	public void setActaentrega(ActaEntrega actaentrega) {
		this.actaentrega = actaentrega;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	

}
