package com.belkacem.jdbc.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	private int id;
	private String name;
	private String note;
	private Date createdDate;
	private Date modifiedDate;
	
	public Student(String name2, String note2) {
		this.name = name2;
		this.note = note2;
	
	}

}
