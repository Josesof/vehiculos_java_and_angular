package com.comment.demo.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "reserva")
public class Reserva implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	
	@OneToOne(fetch = FetchType.LAZY)
	private Cliente cliente;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Comvenio comvenio;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Poliza poliza;
	
	@OneToOne(fetch = FetchType.LAZY)
	private TipoMoneda tipoMoneda;

	// orphanRemoval = true sirve para borrar registros huerfanos
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Vehiculo> vehiculo;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "fecha_Reserva")
	private Date FechaReserva;

	public Reserva() {
		
	}

	public Reserva(Long id, Cliente cliente, Comvenio comvenio, Poliza poliza, TipoMoneda tipoMoneda,
			List<Vehiculo> vehiculo, Date fechaReserva) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.comvenio = comvenio;
		this.poliza = poliza;
		this.tipoMoneda = tipoMoneda;
		this.vehiculo = vehiculo;
		FechaReserva = fechaReserva;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Comvenio getComvenio() {
		return comvenio;
	}

	public void setComvenio(Comvenio comvenio) {
		this.comvenio = comvenio;
	}

	public Poliza getPoliza() {
		return poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}

	public TipoMoneda getTipoMoneda() {
		return tipoMoneda;
	}

	public void setTipoMoneda(TipoMoneda tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}

	public List<Vehiculo> getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(List<Vehiculo> vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Date getFechaReserva() {
		return FechaReserva;
	}

	public void setFecha_Reserva(Date fechaReserva) {
		FechaReserva = fechaReserva;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
