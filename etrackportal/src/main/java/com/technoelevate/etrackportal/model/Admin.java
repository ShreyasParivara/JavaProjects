package com.technoelevate.etrackportal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Admin {
	@Id
	private String EmailId;
	private String UserName;
	private String password;

}
