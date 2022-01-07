package com.te.beanspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
@Configuration
public class Pet {
	String name;
	@Autowired
	@Qualifier("duck")
	Animal animal;

	public void doThings() {
		if (animal.isPet()) {
			animal.eat();
			animal.sound();
		} else {
			System.out.println("Not a pet");
		}

	}

}
