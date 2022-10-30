package com.belkacem.jdbc.dao;

import java.util.List;
import org.slf4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import com.belkacem.jdbc.dto.PatchStudentDTO;
import com.belkacem.jdbc.dto.StudentResponseDTO;
import com.belkacem.jdbc.model.Student;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class StudentRepositoryImpl implements StudentRepository {
	String patchSqlQuery = "UPDATE student SET name = ?, note = ?" + "WHERE id=?;";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private StudentResponseDTO responseDTO = new StudentResponseDTO();

	public List<Student> getAll() {
		String sql = "SELECT * FROM student";
		log.info(sql);
		return jdbcTemplate.query(sql, responseDTO);

	}

	@Override
	public Student patchStudent(PatchStudentDTO patchStudentDTO, int id) {
		int isUpdated = jdbcTemplate.update(patchSqlQuery, patchStudentDTO.getName(), patchStudentDTO.getNote(), id);
		if (isUpdated == 0)
			log.info(patchSqlQuery);
		List<Student> studentDTO = jdbcTemplate.query("SELECT * FROM student", responseDTO);
		return new Student(studentDTO.get(0).getId(), studentDTO.get(0).getName(), studentDTO.get(0).getNote(),
				studentDTO.get(0).getCreatedDate(), studentDTO.get(0).getModifiedDate());
	}

}
