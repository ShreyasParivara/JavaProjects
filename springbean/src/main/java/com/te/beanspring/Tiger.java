package com.te.beanspring;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Tiger implements Animal {

	@Override
	public void eat() {
		System.out.println("Eats Meat");
	}

	@Override
	public void sound() {
		System.out.println("Roar");
		
	}

	@Override
	public boolean isPet() {
		
		return false;
	}

}
