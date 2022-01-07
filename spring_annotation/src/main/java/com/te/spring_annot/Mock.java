package com.te.spring_annot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mock {
	@Value("good")
	String rating;
	@Value("80")
	int theory;
	@Value("80")
	int practical;
	@Override
	public String toString() {
		return "Mock [rating=" + rating + ", theory=" + theory + ", practical=" + practical + "]";
	}

}
