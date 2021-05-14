package com.proyect.unab.parcial3.Entidades;

import lombok.Data;

@Data
public class Consulta {
   private int Id;
   private String Nombre;
   private String Apellido;
   
   
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
public String getApellido() {
	return Apellido;
}
public void setApellido(String apellido) {
	Apellido = apellido;
}
}
