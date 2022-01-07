package com.te.collection;

public class Employee implements Comparable<Employee> {
	int empid;
	String name;
	double salary;
	public Employee(int empid, String name, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Eployee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		//int temp =Integer.parseInt(o.name);
		//int temp1 = Integer.parseInt(this.name);
		return (int)(o.salary-this.salary);
	}
	 

}
