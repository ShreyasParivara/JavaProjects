package com.te.interfaces;

public class Extract {

	public static void main(String[] args) {
		NormalClass obj = new NormalClass();
		obj.m1();
		obj.m2();
		I1 obj1 = obj;
		obj1.m1();
		I1.m2();

	}

}
