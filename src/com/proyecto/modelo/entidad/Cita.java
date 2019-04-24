package com.proyecto.modelo.entidad;

import java.util.Date;

public class Cita {
	
	private Integer codigo;
	private Date fecha;
	private String horario;
	private String disponible;
	
	public Cita() {
		super();
	}
	
	public Cita(Integer codigo, Date fecha, String horario, String disponible) {
		super();
		this.codigo = codigo;
		this.fecha = fecha;
		this.horario = horario;
		this.disponible = disponible;
	}

	public Integer getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public String getHorario() {
		return horario;
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public String getDisponible() {
		return disponible;
	}
	
	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}
}
