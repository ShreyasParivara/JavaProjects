package com.te.hasarelationship;

public class Processor {
	String brand;
	int core;
	double speed;
	public Processor(String brand, int core, double speed) {
		super();
		this.brand = brand;
		this.core = core;
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", core=" + core + ", speed=" + speed + "]";
	}
   
}
