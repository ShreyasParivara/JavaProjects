package com.te.abstraction;

public class CarOwner {

	public static void main(String[] args) {
      Driver d = new Driver();
      d.drive(new Audi());
      System.out.println("*********");
      Driver d1 = new Driver();
      d1.drive(new Bmw());
	}

}
