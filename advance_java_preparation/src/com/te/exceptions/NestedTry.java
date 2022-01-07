package com.te.exceptions;

public class NestedTry {

	public static void main(String[] args) {
		try {
			double result = 1 / 0;
		} catch (ArithmeticException e) {
			System.out.println("first catch block");
			try {
				double result = 1 / 0;
			} catch (ArithmeticException s) {
				System.out.println("inner catch block");
			}
		}
	}

}
