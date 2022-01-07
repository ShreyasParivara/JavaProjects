
package com.te.methodReference;

public class Myclass {
	int sum(int i, int j) {
		return i+j;
	}
	static int addition(int i, int j) { 
		return i+j;
	}
	public static void main(String[] args) {
		FunInterface f = new Myclass()::sum;
		System.out.println(f.add(3, 2));
		FunInterface fi = Myclass::addition;
		System.out.println(fi.add(3, 3));
	}
	

}
