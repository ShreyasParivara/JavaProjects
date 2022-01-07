package com.technoelevate.encapsulation;

public class Admin {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.set(123 ,"Tom","Software engineer");
		Employee emp2=new Employee();
		emp2.set(456,"jerry","developer");
		emp1.get();
		System.out.println("--------");
		emp2.get();
		
		
	}

}
