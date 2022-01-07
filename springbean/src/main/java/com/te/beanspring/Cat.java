package com.te.beanspring;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("Eat mouse");
		
	}

	@Override
	public void sound() {
		System.out.println("Meow Meow");
		
	}

	@Override
	public boolean isPet() {
		return true;
	}

}
