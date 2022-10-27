package com.belkacem.jdbc.dto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.belkacem.jdbc.model.Student;

public class StudentResponseDTO implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		int id = rs.getInt("id");
		String name = rs.getString("name");
		String note = rs.getString("note");
		Date createdDate = rs.getDate("createdDate");
		Date modifiedDate = rs.getDate("modifiedDate");		
		return new Student(id, name, note, createdDate, modifiedDate);
	}

}
