package com.te.interfaces;

public class NormalClass implements I1 {


	@Override
	public void m1() {
		System.out.println("Override method from normal class");
	}
	public static void m2() {
		System.out.println("from static method of normal class");
	}

}
