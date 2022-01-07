package com.te.spring_annot;

import org.springframework.beans.factory.annotation.Value;

public class Water {
	@Override
	public String toString() {
		return "Water [type=" + type + "]";
	}

	@Value("salt water")
	String type;
	
	

}
