package com.proyecto.modelo.persistencia;

import java.util.List;

import com.proyecto.modelo.entidad.Cita;
import com.proyecto.modelo.entidad.Reserva;
import com.proyecto.modelo.entidad.Tarifa;
import com.proyecto.modelo.entidad.Tratamiento;

public interface CentroQuiroVKDAO {

	// Método para buscar las citas disponibles de un dia
	List<Cita> buscarCitas(String fecha);
	
	// Método para reservar una hora seleccionada
	void reservarHora(Integer codCita) throws Exception;
	
	// Método para guardar los datos de una reserva
	void insertarReserva(Reserva reserva) throws Exception;
	
	// Método para buscar los tratamientos de la clínica
	List<Tratamiento> buscarTratamientos();
	
	// Método para buscar las tarifas
	List<Tarifa> buscarTarifas();
}
