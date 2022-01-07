package com.te.Preparation;

public class MethodOverload {
	public void m1() {
		System.out.println("No argument method");
	}
	public int m1(int a,int b) {
		System.out.println("two argument method");
		return a+b;
	}
	public double m1(double a, double b) {
		return a+b;
	}
	public void m2() {
		System.out.println("No argument method static ");
	}
	public int m2(int a,int b) {
		System.out.println("two argument method static");
		return a+b;
	}
	public double m2(double a, double b) {
		return a+b;
	}

	public static void main(String[] args) {
		MethodOverload ob = new MethodOverload();
		ob.m1();
		System.out.println(ob.m1(1,2));
		System.out.println(ob.m1(1.1,1.1));
		ob.m2();
		System.out.println(ob.m2(1,2));
		System.out.println(ob.m2(1.1,1.1));
		
		

	}

}
