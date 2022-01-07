package com.te.Preparation;

public class Driver {
	void drive(CarFunction fun) {
		fun.engineStart();
		fun.accelrate();
		fun.stop();
		
	}

	public static void main(String[] args) {
		Driver d = new Driver();
		Bmw b = new Bmw();
		Audi a = new Audi();
		d.drive(a);
		System.out.println("****************");
		d.drive(b);
	}

}
