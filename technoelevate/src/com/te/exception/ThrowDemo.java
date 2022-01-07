package com.te.exception;

public class ThrowDemo {
	public void m1() throws Throwable {
		System.out.println("Method throwing exception");
		throw new Throwable();
	}

	public static void main(String[] args) {
		ThrowDemo td = new ThrowDemo();
		System.out.println("Method calling");
		try {
		td.m1();
		} catch (Throwable e) {
			System.out.println("Exception occurred");
		}

	}

}
