package com.te.hasarelationship;

public class Audi extends Car{
	int a=10;

	
	 public Audi(int milage, int topSpeed, String brand) {
		super(milage, topSpeed, brand);
		
	}
	 
	

	public static void main(String[] args) {
		Audi c = new Audi(10, 300,"Audi");
		Engine e = new Engine ( 300, 8);
		System.out.println(e);
		System.out.println(c);
		
	}
	
}
