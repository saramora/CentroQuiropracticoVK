package com.proyecto.modelo.entidad;

public class Reserva {

	private Integer codigo;
	private String nombre;
	private String email;
	private String telefono;
	private Integer codCita;
	
	public Reserva() {
		super();
	}

	public Reserva(Integer codigo, String nombre, String email, String telefono, Integer codCita) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.codCita = codCita;
	}
	
	public Reserva(String nombre, String email, String telefono, Integer codCita) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.codCita = codCita;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Integer getCodCita() {
		return codCita;
	}

	public void setCodCita(Integer codCita) {
		this.codCita = codCita;
	}
	
	
}
