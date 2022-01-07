package com.te.hasarelationship;

public class Car {
	int milage;
	int topSpeed;
	String brand;
	public Car(int milage, int topSpeed, String brand) {
		this.milage = milage;
		this.topSpeed = topSpeed;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Car [milage=" + milage + ", topSpeed=" + topSpeed + ", brand=" + brand + "]";
	}
	

}
