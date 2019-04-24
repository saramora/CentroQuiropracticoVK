package com.proyecto.modelo.entidad;


public class Tratamiento {
	private Integer codigo;
	private String nomTratamiento;
	private String descTratamiento;
	private String imagen;
	private String disponible;
	
	public Tratamiento() {
		super();
	}

	public Tratamiento(Integer codigo, String nomTratamiento, String descTratamiento, String imagen, String disponible) {
		super();
		this.codigo = codigo;
		this.nomTratamiento = nomTratamiento;
		this.descTratamiento = descTratamiento;
		this.imagen = imagen;
		this.disponible = disponible;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNomTratamiento() {
		return nomTratamiento;
	}

	public void setNomTratamiento(String nomTratamiento) {
		this.nomTratamiento = nomTratamiento;
	}

	public String getDescTratamiento() {
		return descTratamiento;
	}

	public void setDescTratamiento(String descTratamiento) {
		this.descTratamiento = descTratamiento;
	}
	
	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getDisponible() {
		return disponible;
	}

	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}
}
