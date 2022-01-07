package com.te.abstraction;

public class Bmw extends Car{
	@Override
	public void start() {
    System.out.println("car starts");

		
	}

	@Override
	public void accelrate() {
		System.out.println("car accelrate");
		
	}

	@Override
	public void breaks() {
		System.out.println("car stops");
		
	}
}
