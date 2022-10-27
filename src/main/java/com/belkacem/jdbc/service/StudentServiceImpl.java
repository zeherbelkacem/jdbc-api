package com.belkacem.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belkacem.jdbc.dao.StudentRepository;
import com.belkacem.jdbc.dto.PatchStudentDTO;
import com.belkacem.jdbc.model.Student;

@Service
public class StudentServiceImpl {

	@Autowired
	private StudentRepository  studentRepository;
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentRepository.getAll();
	}
	public Student patchStudent(PatchStudentDTO patchStudentDTO, int id) {
		// TODO Auto-generated method stub
		return studentRepository.patchStudent(patchStudentDTO, id);
	}

}
