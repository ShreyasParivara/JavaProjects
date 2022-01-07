package com.te.Preparation;

public class PrivateConst {
	int a=10;
	private PrivateConst() {
		
	}
	public PrivateConst(int a , int b) {
		
	}

	public static void main(String[] args) {
		PrivateConst c = new PrivateConst();
		System.out.println(c.a);

	}

}
