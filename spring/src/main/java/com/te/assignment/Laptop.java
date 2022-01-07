package com.te.assignment;

public class Laptop {

	String brand;
	double price;
	String processor;
	Battery battery;

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public Laptop(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", processor=" + processor + ", Battery capacity= "
				+ battery.capacity + ", volt= " + battery.volt + "]";
	}

}
