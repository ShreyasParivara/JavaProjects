package com.te.spring_annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Fish {
	@Value("shark")
	String name;
	@Autowired
	Water water;
	@Override
	public String toString() {
		return "Fish [name=" + name + ", water=" + water + "]";
	}

}
