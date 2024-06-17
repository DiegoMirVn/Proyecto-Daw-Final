package com.curso.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Terapeuta {

	@Id
	private String dni;
	private String nombre;
	private String apellidos;
	private String password;
	private String telefono;
	private String email;
	private String especialidad;

	public Terapeuta() {
		super();
		
	}

	public Terapeuta(String nombre, String apellidos, String password, String dni, String telefono, String email,
			String especialidad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.password = password;
		this.dni = dni;
		this.telefono = telefono;
		this.email = email;
		this.especialidad = especialidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Terapeuta other = (Terapeuta) obj;
		return Objects.equals(dni, other.dni);
	}

	
	
}
