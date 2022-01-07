package com.te.abstraction;

public class Simbha extends Dog {
	Simbha(int age, int weight, String breed) {
		super(age, weight, breed);
	
	}
	public void bark() {
		System.out.println("wie wie");
	}
	public void bite() {
		System.out.println("Bite everyone");
	}
	public void eat() {
		System.out.println("eat only chicken");
	}

}
