package com.te.Preparation;

public class Calc {
	public static void main(String[] args) {
		Volume v = new Volume();
		Triangle t = new Triangle(2, 2);
		Rectangle r = new Rectangle(2, 2, 2);
		System.out.println("Triangle " + v.getvolume(t));
		System.out.println("Rectangle " + v.getvolume(r));

	}

}
