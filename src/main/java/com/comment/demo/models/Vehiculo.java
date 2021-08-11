package com.comment.demo.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class Vehiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "modelo")
	private String Modelo;
	
	@Column(name = "marca")
	private String Marca;
	

	
	@Column(name = "capacidad_Pasajeros")
	private String capacidadPasajeros;
	
	@Column(name = "kilometraje")
	private String kilometraje;
	
	@Column(name = "gama")
	private String gama;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "consumo")
	private String consumo;
	
	@Column(name = "tipo_Combustible")
	private String tipoCombustible;
	
	@Column(name = "numero_Puertas")
	private String numeroPuertas;
	
	@Column(name = "tipo_Vehiculo")
	private String tipoVehiculo;
	
	@Column(name = "categoria_Conduccion")
	private String categoriaConduccion;
	
	@Column(name = "video")
	private String video;
	
	@Column(name = "foto")
	private Double foto;

	@Column(name = "costo")
	private Double costo;

	public Vehiculo() {
	
	}

	public Vehiculo(Long id, String modelo, String marca, String capacidadPasajeros, String kilometraje, String gama,
			String color, String consumo, String tipoCombustible, String numeroPuertas, String tipoVehiculo,
			String categoriaConduccion, String video, Double foto, Double costo) {
		super();
		this.id = id;
		Modelo = modelo;
		Marca = marca;
		this.capacidadPasajeros = capacidadPasajeros;
		this.kilometraje = kilometraje;
		this.gama = gama;
		this.color = color;
		this.consumo = consumo;
		this.tipoCombustible = tipoCombustible;
		this.numeroPuertas = numeroPuertas;
		this.tipoVehiculo = tipoVehiculo;
		this.categoriaConduccion = categoriaConduccion;
		this.video = video;
		this.foto = foto;
		this.costo = costo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getCapacidadPasajeros() {
		return capacidadPasajeros;
	}

	public void setCapacidadPasajeros(String capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}

	public String getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(String kilometraje) {
		this.kilometraje = kilometraje;
	}

	public String getGama() {
		return gama;
	}

	public void setGama(String gama) {
		this.gama = gama;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getConsumo() {
		return consumo;
	}

	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public String getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(String numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public String getCategoriaConduccion() {
		return categoriaConduccion;
	}

	public void setCategoriaConduccion(String categoriaConduccion) {
		this.categoriaConduccion = categoriaConduccion;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public Double getFoto() {
		return foto;
	}

	public void setFoto(Double foto) {
		this.foto = foto;
	}

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	
	

}
