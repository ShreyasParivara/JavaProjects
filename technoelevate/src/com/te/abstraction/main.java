package com.te.abstraction;

public class main {

	public static void main(String[] args) {
	Test t = new Test2();//upcasting
	t.m1();
	Test2 t1 = (Test2) t;//downcasting
	t1.m1();
	t1.m2();
	
	

	}

}
