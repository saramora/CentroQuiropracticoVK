package com.proyecto.modelo.negocio;

import java.util.List;

import com.proyecto.modelo.entidad.Cita;
import com.proyecto.modelo.entidad.Reserva;
import com.proyecto.modelo.entidad.Tarifa;
import com.proyecto.modelo.entidad.Tratamiento;

public interface GestorCentroQuiroVK {
	
	// Método que busca las citas disponibles para un día seleccionado
	List<Cita> buscarCitas(String fecha);
	
	// Método para reservar una cita disponible
	void reservarHora(Integer codCita) throws Exception;
	
	// Método para guardar los datos de una reserva
	void insertarReserva(Reserva reserva) throws Exception;
	
	// Método que busca los tratamientos de la clínica
	List<Tratamiento> buscarTratamientos();
		
	// Método que busca las tarifas de los tratamientos
	List<Tarifa> buscarTarifas();
}
