package com.cristianRuizBlog.aplicacion.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Historial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@JoinColumn(name = "venta")
	private Venta venta;
	@Column
	private String nombre ;
	@Column
	private String apellido;
	@Column
	private String edad;
	@OneToOne
	@JoinColumn(name = "genero")
	private Genero genero;
	@Column
	private double peso;
	@Column
	private double altura;
	@Column
	private String antecedentes;
	@Column
	private String alergias;
	@Column
	private String medicamentosActuales;
	@Column
	private String examenFisico;
	@Column
	private String tratamientoRecomendado;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Venta getVenta() {
		return venta;
	}
	public void setVenta(Venta venta) {
		this.venta = venta;
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
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getAntecedentes() {
		return antecedentes;
	}
	public void setAntecedentes(String antecedentes) {
		this.antecedentes = antecedentes;
	}
	public String getAlergias() {
		return alergias;
	}
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}
	public String getMedicamentosActuales() {
		return medicamentosActuales;
	}
	public void setMedicamentosActuales(String medicamentosActuales) {
		this.medicamentosActuales = medicamentosActuales;
	}
	public String getExamenFisico() {
		return examenFisico;
	}
	public void setExamenFisico(String examenFisico) {
		this.examenFisico = examenFisico;
	}
	public String getTratamientoRecomendado() {
		return tratamientoRecomendado;
	}
	public void setTratamientoRecomendado(String tratamientoRecomendado) {
		this.tratamientoRecomendado = tratamientoRecomendado;
	}
	
	
}
