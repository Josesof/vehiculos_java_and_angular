package com.comment.demo.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "acta_entrega")
public class ActaEntrega implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre_Empleado_E")
	private String nombreEmpleadoE;

	@Column(name = "kilometraje_Entrega")
	private String kilometrajeEntrega;

	@Column(name = "direccion_Entrega")
	private String direccionEntrega;

	@Column(name = "nivel_Gasolina")
	private String nivelGasolina;

	@Column(name = "foto")
	private Double foto;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "fecha_Entregar")
	private Date fecha_Entregar;

	@OneToOne(fetch = FetchType.LAZY)
	private Reserva reserva;

	public ActaEntrega() {

	}

	public ActaEntrega(Long id, String nombreEmpleadoE, String kilometrajeEntrega, String direccionEntrega,
			String nivelGasolina, Double foto, Date fecha_Entregar, Reserva reserva) {
		super();
		this.id = id;
		this.nombreEmpleadoE = nombreEmpleadoE;
		this.kilometrajeEntrega = kilometrajeEntrega;
		this.direccionEntrega = direccionEntrega;
		this.nivelGasolina = nivelGasolina;
		this.foto = foto;
		this.fecha_Entregar = fecha_Entregar;
		this.reserva = reserva;
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

	public String getKilometrajeEntrega() {
		return kilometrajeEntrega;
	}

	public void setKilometrajeEntrega(String kilometrajeEntrega) {
		this.kilometrajeEntrega = kilometrajeEntrega;
	}

	public String getDireccionEntrega() {
		return direccionEntrega;
	}

	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
	}

	public String getNivelGasolina() {
		return nivelGasolina;
	}

	public void setNivelGasolina(String nivelGasolina) {
		this.nivelGasolina = nivelGasolina;
	}

	public Double getFoto() {
		return foto;
	}

	public void setFoto(Double foto) {
		this.foto = foto;
	}

	public Date getFecha_Entregar() {
		return fecha_Entregar;
	}

	public void setFecha_Entregar(Date fecha_Entregar) {
		this.fecha_Entregar = fecha_Entregar;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
