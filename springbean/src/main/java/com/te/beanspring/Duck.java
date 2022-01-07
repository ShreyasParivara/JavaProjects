package com.te.beanspring;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Duck implements Animal {

	@Override
	public void eat() {
		System.out.println("Eat feed");
		
	}

	@Override
	public void sound() {
		System.out.println("Quak Quak");
	}

	@Override
	public boolean isPet() {
		
		return true;
	}

}
