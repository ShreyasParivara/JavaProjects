package com.te.mail.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Drafts {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String toAddress;
	private String fromAddress;
	private String subject;
	private String message;

}
