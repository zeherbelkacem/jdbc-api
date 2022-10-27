package com.belkacem.jdbc.dao;

import java.util.List;

import com.belkacem.jdbc.dto.PatchStudentDTO;
import com.belkacem.jdbc.model.Student;

public interface StudentRepository {

	public List<Student> getAll();

	public Student patchStudent(PatchStudentDTO patchStudentDTO, int id);
	

}
