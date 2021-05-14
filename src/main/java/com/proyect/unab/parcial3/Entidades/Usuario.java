package com.proyect.unab.parcial3.Entidades;

import lombok.Data;

@Data
public class Usuario {
	private int Id;
	private String Nombre;
	private String Contrasena;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getContrasena() {
		return Contrasena;
	}
	public void setContrasena(String contrasena) {
		Contrasena = contrasena;
	}
}
