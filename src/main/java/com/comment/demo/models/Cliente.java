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
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "tipo_documento")
	private String tipo_documento;
	@Column(name = "documento")
	private String documento;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "direccion")
	private String direccion;
	@Column(name = "codigo_postal")
	private String codigo_postal;
	@Column(name = "numero_telefono1")
	private String numero_telefono1;
	@Column(name = "numero_telefono2")
	private String numero_telefono2;
	@Column(name = "correo_electronico")
	private String correo_electronico;
	@Column(name = "genero")
	private String genero;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "fecha_nacimiento")
	private Date fecha_nacimiento;
	@Column(name = "nivel_estudio")
	private String nivel_estudio;
	@Column(name = "licencia_conduccion")
	private String licencia_conduccion;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "fecha_vencimiento_licencia")
	private Date fecha_vencimiento_licencia;
	@DateTimeFormat(pattern = "yyyy-MM-dd")	
	@Column(name = "fecha_creacion")
	private Date fecha_creacion;
	
	//Fecha creacion de cliente de manera automatica
	@PrePersist
	public void prePersist() {
		fecha_creacion = new Date();
	}
	@Column(name = "contrasena")
	private String contrasena;

	// orphanRemoval = true sirve para borrar registros huerfanos
	//@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	//private List<Reserva> reservas;

	//@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	//private List<ActaEntrega> actaEntrega;

	public Cliente() {

	}

	
	




	public Cliente(Long id, String tipo_documento, String documento, String nombre, String apellido, String direccion,
			String codigo_postal, String numero_telefono1, String numero_telefono2, String correo_electronico,
			String genero, Date fecha_nacimiento, String nivel_estudio, String licencia_conduccion,
			Date fecha_vencimiento_licencia, Date fecha_creacion, String contrasena) {
		super();
		this.id = id;
		this.tipo_documento = tipo_documento;
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.codigo_postal = codigo_postal;
		this.numero_telefono1 = numero_telefono1;
		this.numero_telefono2 = numero_telefono2;
		this.correo_electronico = correo_electronico;
		this.genero = genero;
		this.fecha_nacimiento = fecha_nacimiento;
		this.nivel_estudio = nivel_estudio;
		this.licencia_conduccion = licencia_conduccion;
		this.fecha_vencimiento_licencia = fecha_vencimiento_licencia;
		this.fecha_creacion = fecha_creacion;
		this.contrasena = contrasena;
	}
	
	
	







	public Long getId() {
		return id;
	}







	public void setId(Long id) {
		this.id = id;
	}







	public String getTipo_documento() {
		return tipo_documento;
	}







	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}







	public String getDocumento() {
		return documento;
	}







	public void setDocumento(String documento) {
		this.documento = documento;
	}







	public String getNombre() {
		return nombre;
	}







	public void setNombre(String nombre) {
		this.nombre = nombre;
	}







	public String getApellido() {
		return apellido;
	}







	public void setApellido(String apellido) {
		this.apellido = apellido;
	}







	public String getDireccion() {
		return direccion;
	}







	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}







	public String getCodigo_postal() {
		return codigo_postal;
	}







	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}







	public String getNumero_telefono1() {
		return numero_telefono1;
	}







	public void setNumero_telefono1(String numero_telefono1) {
		this.numero_telefono1 = numero_telefono1;
	}







	public String getNumero_telefono2() {
		return numero_telefono2;
	}







	public void setNumero_telefono2(String numero_telefono2) {
		this.numero_telefono2 = numero_telefono2;
	}







	public String getCorreo_electronico() {
		return correo_electronico;
	}







	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}







	public String getGenero() {
		return genero;
	}







	public void setGenero(String genero) {
		this.genero = genero;
	}







	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}







	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}







	public String getNivel_estudio() {
		return nivel_estudio;
	}







	public void setNivel_estudio(String nivel_estudio) {
		this.nivel_estudio = nivel_estudio;
	}







	public String getLicencia_conduccion() {
		return licencia_conduccion;
	}







	public void setLicencia_conduccion(String licencia_conduccion) {
		this.licencia_conduccion = licencia_conduccion;
	}







	public Date getFecha_vencimiento_licencia() {
		return fecha_vencimiento_licencia;
	}







	public void setFecha_vencimiento_licencia(Date fecha_vencimiento_licencia) {
		this.fecha_vencimiento_licencia = fecha_vencimiento_licencia;
	}







	public Date getFecha_creacion() {
		return fecha_creacion;
	}







	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}







	public String getContrasena() {
		return contrasena;
	}







	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}







	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
