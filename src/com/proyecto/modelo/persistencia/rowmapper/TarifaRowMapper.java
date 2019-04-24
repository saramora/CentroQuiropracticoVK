package com.proyecto.modelo.persistencia.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.proyecto.modelo.entidad.Tarifa;

@Component
public class TarifaRowMapper implements RowMapper<Tarifa>{

	@Override
	public Tarifa mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tarifa tarifa = new Tarifa(rs.getInt("COD_TARIFA"), 
								  rs.getString("DESC_TARIFA"), 
								  rs.getInt("PRECIO"));
		return tarifa;
	}
}
