package com.te.interfaces;

public class Child implements Parent1,Parent2 {
	public void m1() {
		System.out.println("from child");
		}


	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
		Parent1.m2();
		Parent2.m2();

}
}