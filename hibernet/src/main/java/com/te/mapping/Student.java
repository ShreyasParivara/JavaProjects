package com.te.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private int marks;
	@OneToMany(mappedBy = "stud")
	List<Laptop> laptops;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public List<Laptop> getLaptops() {
		return laptops;
	}
	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}
	

}
