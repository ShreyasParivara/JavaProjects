package com.te.mail.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Service;

import lombok.Data;

@Entity
@Data
@Table(name="User_info")
public class Register {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="Username")
	private String regName;
	@Column(name="MailId")
	private String regMail;
	@Column(name="Password")
	private String regPass;

}
