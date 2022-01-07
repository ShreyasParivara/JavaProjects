package com.te.mapping.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class StudentOneToOne {
	@Id
	private int studentId;
	private String name;
	@OneToOne
	private LaptopOneToOne laptop;
	
	
	public StudentOneToOne(int studentId, String name, LaptopOneToOne laptop) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.laptop = laptop;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
