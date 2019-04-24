package com.proyecto.modelo.negocio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.modelo.entidad.Cita;
import com.proyecto.modelo.entidad.Reserva;
import com.proyecto.modelo.entidad.Tarifa;
import com.proyecto.modelo.entidad.Tratamiento;
import com.proyecto.modelo.persistencia.CentroQuiroVKDAO;

@Service
public class GestorCentroQuiroVKImpl implements GestorCentroQuiroVK {
	
	@Autowired GestorCentroQuiroVK gestorCentroQuiroVK;
	@Autowired private CentroQuiroVKDAO centroQuiroVKDAO;
	
	
	@Override
	public List<Cita> buscarCitas(String fecha){
		return centroQuiroVKDAO.buscarCitas(fecha);
	}


	@Override
	public void reservarHora(Integer codCita) throws Exception {
		centroQuiroVKDAO.reservarHora(codCita);
	}

	
	@Override
	public void insertarReserva(Reserva reserva) throws Exception {
		centroQuiroVKDAO.insertarReserva(reserva);
	}


	@Override
	public List<Tratamiento> buscarTratamientos() {
		return centroQuiroVKDAO.buscarTratamientos();
	}


	@Override
	public List<Tarifa> buscarTarifas() {
		return centroQuiroVKDAO.buscarTarifas();
	}
}
