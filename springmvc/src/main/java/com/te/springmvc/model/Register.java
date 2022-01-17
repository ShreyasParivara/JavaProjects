package com.te.springmvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data   // automatically generate getters and setters and even overrides to-string
@Entity
public class Register {
	/*
	 * the variable name declared in this class should be same to that of
	 * the name given in jsp page
	 */
	@Id
	private String uname;// <input type="text" name="uname">
	private String email;//<input type="text" name="email">
	private String address;
	private long phoneNo;

}
