package com.te.hasarelationship;

public class Battery {
	double mAh;
	double volt;
	String brand;
	public Battery(double mAh, double volt, String brand) {
		super();
		this.mAh = mAh;
		this.volt = volt;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Battery [mAh=" + mAh + ", volt=" + volt + ", brand=" + brand + "]";
	}
	

}
