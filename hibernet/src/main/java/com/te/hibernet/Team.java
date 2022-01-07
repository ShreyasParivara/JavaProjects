package com.te.hibernet;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team {
	@Id
	private int empid;
	private String name;
	private double salary;
	private String designation;
	@Override
	public String toString() {
		return "Team [empid=" + empid + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
