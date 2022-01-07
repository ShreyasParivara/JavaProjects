package com.te.abstraction;

public class Bruclee extends Dog{
	Bruclee(int age, int weight, String breed) {
		super(age, weight, breed);}
	public void bark()
	{
		System.out.println("woof wooof");
	}
	public void bite() {
		System.out.println("Bite other dogs");
	}
	public void eat() {
		System.out.println("Eat chicken");
	}
}
