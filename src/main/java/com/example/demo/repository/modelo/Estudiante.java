package com.example.demo.repository.modelo;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="estudiante")
public class Estudiante {
	@Id
	//@GeneratedValue el nombre de la @SequenceGenerator sequenceName
	@GeneratedValue(generator = "seq_estudiante",strategy = GenerationType.AUTO )
	@SequenceGenerator(name="seq_estudiante", sequenceName = "seq_estudiante",allocationSize = 1)
	@Column(name="estu_id")
	public Integer id;
	@Column(name="estu_nombre")
	public String nombre;
	@Column(name="estu_apellido")
	public String apellido;
	@Column(name="estu_cedula")
	public String cedula;
	
	//Getters y Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
}
