package com.te.mail.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
public class ComposeData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String toAddress;
	private String fromAddress;
	private String subject;
	private String message;

}
