package com.te.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LaptopOneToMany {
	@Id
	private int lid;
	private String lname;
	@ManyToOne
	private StudentOneToMany student;
	
	public StudentOneToMany getStudent() {
		return student;
	}
	public void setStudent(StudentOneToMany student) {
		this.student = student;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
	
	

}
