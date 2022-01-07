package com.te.Preparation;

public class Inheritance3 extends Inheritance2 {

	public static void main(String[] args) {

		Inheritace1 i = new Inheritance2();
		Inheritance2 i2 = (Inheritance2) i;
		Inheritance3 i3 = new Inheritance3();
		i.m1();
		i2.m1();
		i3.m1();
		
	}

	public static void m1() {
		System.out.println("from static of i3");
	}

	public void m2() {
		System.out.println("from non static of i3");
	}

}
