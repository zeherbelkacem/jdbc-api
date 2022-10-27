package com.belkacem.jdbc.controller;

import java.util.List;
import org.slf4j.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.belkacem.jdbc.dto.PatchStudentDTO;
import com.belkacem.jdbc.model.Student;
import com.belkacem.jdbc.service.StudentServiceImpl;

@RestController
@RequestMapping("api/v1/student")
public class StudentRestController {
	
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	
	@GetMapping
	public List<Student> getAll() {
		return studentServiceImpl.getAll();
	}
	
	@PatchMapping("/{id}")
	public Student patchStudents(@RequestBody PatchStudentDTO patchStudentDTO, @PathVariable int id) {
		return studentServiceImpl.patchStudent(patchStudentDTO, id);
	}

}
