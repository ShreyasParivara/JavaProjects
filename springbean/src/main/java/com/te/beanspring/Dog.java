package com.te.beanspring;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("Eats Pedigree");
		
	}

	@Override
	public void sound() {
		System.out.println("Woof Woof");
		
	}

	@Override
	public boolean isPet() {
		return true;
	}

}
