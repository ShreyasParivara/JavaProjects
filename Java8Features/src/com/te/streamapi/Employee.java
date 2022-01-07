package com.te.streamapi;

public class Employee {
	int employeeId;
	String name;
	double salary;
	String designation;
	int age;
	public Employee(int employeeId, String name, double salary, String designation, int age) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", designation="
				+ designation + ", age=" + age + "]";
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 

}
