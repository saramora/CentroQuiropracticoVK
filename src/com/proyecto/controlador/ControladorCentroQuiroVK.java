package com.proyecto.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.proyecto.modelo.entidad.Cita;
import com.proyecto.modelo.entidad.Reserva;
import com.proyecto.modelo.entidad.Tarifa;
import com.proyecto.modelo.entidad.Tratamiento;
import com.proyecto.modelo.negocio.GestorCentroQuiroVK;

@Controller
//@RequestMapping("centro")
public class ControladorCentroQuiroVK {
	
	@Autowired
	GestorCentroQuiroVK gestorCentroQuiroVK;
	
	@RequestMapping(path="guardarCita", method=RequestMethod.GET)
	public ModelAndView guardarCita(@RequestParam("codCita")Integer codCita, 
								    @RequestParam("nombre")String nombre,
								    @RequestParam("email")String email, 
								    @RequestParam("telefono")String telefono ) {
		ModelAndView mav = new ModelAndView("/WEB-INF/vistas/mensajeReserva");
		
		try {
			// Se actualiza la hora de la cita para que no esté disponible.
			gestorCentroQuiroVK.reservarHora(codCita);
			
			// Se guardan los datos de la reserva
			Reserva reserva = new Reserva(nombre, email, telefono, codCita);
			gestorCentroQuiroVK.insertarReserva(reserva);
			
			mav.addObject("mensaje", "Su cita se ha guardado correctamente.");
		} catch (Exception e) {
			e.getMessage();
			mav.addObject("mensaje", "Se ha producido un error al guardar la cita. ");//\\n Por favor, inténtelo de nuevo más tarde. Gracias");
			return mav;
		}
		
		return mav;
	}
	
	//GET centro/contacto
	@RequestMapping(path="contacto", method=RequestMethod.GET)
	public ModelAndView getContacto() {
		ModelAndView mav = new ModelAndView("/WEB-INF/vistas/contacto");
		return mav;
	}	

	//GET centro/formularioCitas
	@RequestMapping(path="formularioCitas", method=RequestMethod.GET)
	public ModelAndView formularioCitas() {
		ModelAndView mav = new ModelAndView("/WEB-INF/vistas/citasDisponibles");
		return mav;
	}	

	//POST centro/buscarCita
	@RequestMapping(path="buscarCitas", method=RequestMethod.GET)
	public ModelAndView buscarCitas(@RequestParam("fecha")String fecha, 
									@RequestParam("nombre")String nombre,
									@RequestParam("email")String email, 
									@RequestParam("telefono")String telefono ){
		ModelAndView mav = new ModelAndView("/WEB-INF/vistas/citasDisponibles");
		
		List<Cita> citas = new ArrayList<Cita>();
		citas = gestorCentroQuiroVK.buscarCitas(fecha);
		
		if(fecha != null) {
			mav.addObject("citasDisponibles", citas);
		}
		else {
			mav.addObject("citasDisponibles",  new ArrayList<Cita>());
		}
		
		mav.addObject("fecha", fecha);
		mav.addObject("nombre", nombre);
		mav.addObject("email", email);
		mav.addObject("telefono", telefono);
		
		return mav;
	}	

	//GET centro/tratamientos
	@RequestMapping(path="tratamientos", method=RequestMethod.GET)
	public ModelAndView getTratamientos() {
		List<Tratamiento> tratamientos = new ArrayList<Tratamiento>();
		tratamientos = gestorCentroQuiroVK.buscarTratamientos();
		
		ModelAndView mav = new ModelAndView("/WEB-INF/vistas/tratamientos");
		
		mav.addObject("tratamientos", tratamientos);
		
		return mav;
	}	
	
	//GET centro/tarifas
	@RequestMapping(path="tarifas", method=RequestMethod.GET)
	public ModelAndView getTarifas() {
		List<Tarifa> tarifas = new ArrayList<Tarifa>();
		tarifas = gestorCentroQuiroVK.buscarTarifas();
			
		ModelAndView mav = new ModelAndView("/WEB-INF/vistas/tarifas");
		
		mav.addObject("tarifas", tarifas);
	
		return mav;
	}	
	
	//GET centro/equipo
	@RequestMapping(path="equipo", method=RequestMethod.GET)
	public ModelAndView getEquipo() {
		ModelAndView mav = new ModelAndView("/WEB-INF/vistas/equipo");
		return mav;
	}

}










