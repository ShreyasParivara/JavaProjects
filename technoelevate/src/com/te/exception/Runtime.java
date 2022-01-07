package com.te.exception;

public class Runtime {
	public static void m1() {
		try {
		m1();
		}
		catch(StackOverflowError e) {
			System.out.println("stack overflow");
		}
	}

	public static void main(String[] args) {
		m1();

	}

}
