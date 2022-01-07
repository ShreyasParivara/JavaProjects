package com.te.abstraction;

public abstract class Dog {
	int age;
	int weight;
	String breed;
	Dog(int age, int weight,String breed){
		this.age=age;
		this.weight=weight;
		this.breed=breed;
	}
	abstract void bark();
	abstract void bite();
	abstract void eat();
	public void poop() {
		 System.out.println("pooping");
	}
}
   