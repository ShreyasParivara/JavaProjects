package com.te.spring_annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Salary {
	@Autowired
	Mock mock;

	@Override
	public String toString() {
		return "Salary [mock=" + mock + "]";
	}
	

}
