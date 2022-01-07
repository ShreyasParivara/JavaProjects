package com.te.factorydesign;

public class Nike implements Brand{
	
	@Override
	public void shirt() {
		System.out.println("Nike shirt");
		
	}

	@Override
	public void shoes() {
		System.out.println("Nike shoes");
		
	}

	@Override
	public void slippers() {
		System.out.println("Nike slippers");
		
	}

	@Override
	public void pant() {
		System.out.println("Nike pant");
		
	}

}
