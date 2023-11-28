package com.distribuida.entities;

public class DatosLibreria {
	
//Atributos
	private String libreria;
	private String direccion;
	private String Telefono;
	private String correo;
	
//Contructor
	public DatosLibreria() {}
	
//Metodos-Getter and Setter
	public String getLibreria() {
		return libreria;
	}

	public void setLibreria(String libreria) {
		this.libreria = libreria;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "DatosLibreria [libreria=" + libreria + ", direccion=" + direccion + ", Telefono=" + Telefono
				+ ", correo=" + correo + "]";
	}
}
