package com.proyecto.modelo.persistencia.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import com.proyecto.modelo.entidad.Cita;

@Component
public class HoraCitaRowMapper implements RowMapper<Cita>{

	@Override
	public Cita mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cita cita = new Cita(rs.getInt("COD_CITA"), 
								  rs.getDate("FECHA"), 
								  rs.getString("HORARIO"), 
								  rs.getString("DISPONIBLE"));
		return cita;
	}
}
