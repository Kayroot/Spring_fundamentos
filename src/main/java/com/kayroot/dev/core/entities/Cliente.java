package com.kayroot.dev.core.entities;

public class Cliente {

	private String usuario;
	private String email;
	
	public Cliente(String usuario, String email) {		
		this.usuario = usuario;
		this.email = email;
	}

	public String getNombre() {
		return usuario;
	}

	public void setNombre(String usuario) {
		this.usuario = usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [usuario=" + usuario + ", email=" + email + "]";
	}		
	
}
