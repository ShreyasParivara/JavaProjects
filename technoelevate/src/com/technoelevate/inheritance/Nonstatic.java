package com.technoelevate.inheritance;

public class Nonstatic extends Staticm {
	public static void m1() {
		   System.out.println("from static m1 of class2");
	   }
	   public static void m2() {
		   System.out.println("from static m2 of class2");
	   }
	   public void m3() {
		  System.out.println("from non static m3 of class 2");
		   
	   }
	   public void m4() {
			  System.out.println("from non static m4 of class 2");
			   
		   }

	public static void main(String[] args) {
       Nonstatic ob =new Nonstatic();
       ob.m3();
       ob.m4();
       Staticm.m1();
       Staticm.m2();
       Nonstatic.m1();
       Nonstatic.m2();
	}

}
