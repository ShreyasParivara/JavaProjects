package com.te.spring;

public class Car {
	Garage e;
	int speed;

	public Car(Garage e) {
		super();
		this.e = e;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void move() {
		e.start();
		System.out.println("car is moving at " + speed + " Kmph");
	}

}
