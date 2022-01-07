package com.te.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private int laptopId;
	private String laptopName;
	@ManyToOne
	private Student stud;
	
	public Student getStud() {
		return stud;
	}
	public void setStud(Student stud) {
		this.stud = stud;
	}
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	
	
	
	

}
