package com.proyecto.modelo.persistencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.proyecto.modelo.entidad.Cita;
import com.proyecto.modelo.entidad.Reserva;
import com.proyecto.modelo.entidad.Tarifa;
import com.proyecto.modelo.entidad.Tratamiento;
import com.proyecto.modelo.persistencia.rowmapper.HoraCitaRowMapper;
import com.proyecto.modelo.persistencia.rowmapper.TarifaRowMapper;
import com.proyecto.modelo.persistencia.rowmapper.TratamientoRowMapper;

@Repository
public class CentroQuiroVKDAOImpl implements CentroQuiroVKDAO {
	
	@Autowired private JdbcTemplate jdbcTemplate;
	@Autowired private HoraCitaRowMapper horaCitaRowMapper;
	@Autowired private TratamientoRowMapper tratamientoRowMapper;
	@Autowired private TarifaRowMapper tarifaRowMapper;

	@Override
	public List<Cita> buscarCitas(String fecha) {
		String sentencia ="select COD_CITA, FECHA, HORARIO, DISPONIBLE from centrovk.CITAS "
				+ "where DISPONIBLE = 'S' AND FECHA like (STR_TO_DATE('"+fecha+"', '%d-%m-%Y'))";
		
		List<Cita> lista = jdbcTemplate.query(sentencia, horaCitaRowMapper);		
		
		return lista;
	}

	@Override
	public void reservarHora(Integer codCita) throws Exception {
		jdbcTemplate.update("update centrovk.citas set DISPONIBLE='N' where COD_CITA = ?", codCita);
	}

	
	@Override
	public void insertarReserva(Reserva reserva) throws Exception {
		String sentencia = "insert into centrovk.reservas (nombre, mail, telefono, cod_cita, fecha_alta) "
				+ " values ('"+reserva.getNombre()+"', '"+reserva.getEmail()+"', '"+reserva.getTelefono()+"', "+reserva.getCodCita()+" , NOW()) ";
		
		jdbcTemplate.update(sentencia);
	}

	@Override
	public List<Tratamiento> buscarTratamientos() {
		String sentencia ="select COD_TRATAMIENTO, NOM_TRATAMIENTO, DESC_TRATAMIENTO, IMAGEN, DISPONIBLE "
				+ "from centrovk.TRATAMIENTOS where DISPONIBLE = 'S'";
		
		List<Tratamiento> lista = jdbcTemplate.query(sentencia, tratamientoRowMapper);		
		
		return lista;
	}

	@Override
	public List<Tarifa> buscarTarifas() {
		String sentencia ="select COD_TARIFA, DESC_TARIFA, PRECIO "
				+ "from centrovk.TARIFAS ORDER BY COD_TARIFA ASC";
		
		List<Tarifa> lista = jdbcTemplate.query(sentencia, tarifaRowMapper);		
		
		return lista;
	}
}
