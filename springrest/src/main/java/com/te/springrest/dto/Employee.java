package com.te.springrest.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee {
	@Id
	private int id;
	private String name;
	private String designation;
	private double salary;

}
