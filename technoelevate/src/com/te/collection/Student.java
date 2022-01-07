package com.te.collection;

import javax.print.attribute.standard.Compression;

public class Student implements Comparable<Student> {
	Integer rollNo;
	String name;
	Integer marks;

	public Student(Integer rollNo, String name, Integer marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Classroom [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student object) {

		return this.name.compareTo(object.name);
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

}
