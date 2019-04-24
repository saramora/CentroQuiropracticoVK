package com.proyecto.modelo.persistencia.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.proyecto.modelo.entidad.Tratamiento;

@Component
public class TratamientoRowMapper implements RowMapper<Tratamiento>{

	@Override
	public Tratamiento mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tratamiento tratamiento = new Tratamiento(rs.getInt("COD_TRATAMIENTO"), 
								  rs.getString("NOM_TRATAMIENTO"), 
								  rs.getString("DESC_TRATAMIENTO"), 
								  rs.getString("IMAGEN"),
								  rs.getString("DISPONIBLE"));
		return tratamiento;
	}
}
