package com.te.spring;

public class Engine implements Garage {
	String name;
	double cc;

	public void setName(String name) {
		this.name = name;
	}

	public Engine(double cc) {
		super();
		this.cc = cc;
	}

	@Override
	public void start() {
		System.out.println(name + " Engine started and its capacity is " + cc);

	}

}
