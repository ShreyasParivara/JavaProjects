package com.te.factorydesign;

public class Adidas implements Brand{

	@Override
	public void shirt() {
		System.out.println("Adidas shirt");
		
	}

	@Override
	public void shoes() {
		System.out.println("Adidas shoes");
		
	}

	@Override
	public void slippers() {
		System.out.println("Adidas slippers");
		
	}

	@Override
	public void pant() {
		System.out.println("Adidas pant");
		
	}

}
