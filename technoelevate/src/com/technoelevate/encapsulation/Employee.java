package com.technoelevate.encapsulation;

public class Employee {
	private int eid;
	private String name;
	private String designation;
	private static String company="Technoelevate";
	public void set(int eid,String name,String designation) {
		this.eid=eid;
		this.name=name;
		this.designation=designation;
		}
	public void get() {
		System.out.println("Company Name: "+company);
		System.out.println("Employee Id: "+eid);
		System.out.println("Name: "+name);
		System.out.println("Designation: "+designation);
	}

}
