package com.proyecto.modelo.entidad;

public class Tarifa {
	private Integer codigo;
	private String descTarifa;
	private Integer precio;
	
	public Tarifa() {
		super();
	}

	public Tarifa(Integer codigo, String descTarifa, Integer precio) {
		super();
		this.codigo = codigo;
		this.descTarifa = descTarifa;
		this.precio = precio;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescTarifa() {
		return descTarifa;
	}

	public void setDescTarifa(String descTarifa) {
		this.descTarifa = descTarifa;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
}
