package com.te.hasarelationship;

public class Operating {
	String brand;
	double version;
	double bit;
	public Operating(String brand, double version, double bit) {
		super();
		this.brand = brand;
		this.version = version;
		this.bit = bit;
	}
	@Override
	public String toString() {
		return "Operating [brand=" + brand + ", version=" + version + ", bit=" + bit + "]";
	}
	
	 

}
