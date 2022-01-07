package com.technoelevate.inheritance;

public class Varargs {
	public static void arg1(int a) {
		System.out.println("one argument");
	}
	public static void arg1(int x,String ...c) {
		System.out.println("Varags method called");
		System.out.println(c[1]);
		for(int i=0; i<c.length;i++) {
			System.out.println(c[i]);
		}
	}
	public static void main(String[] args) {
		Varargs.arg1(10);
		Varargs.arg1(10,"hello","how","are","you");
	}

}
