package com.te.spring.autowore;

public class Battery {
	int mah=6000;

	@Override
	public String toString() {
		return "Battery [mah=" + mah + "]";
	}
	void demo() {
		System.out.println("Battery method");
	}
	

}
