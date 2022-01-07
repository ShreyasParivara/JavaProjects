package com.technoelevate.programs;
public class MethodOverload {
	public void login(String name, String password) {
		System.out.println("Your name is "+name);
		System.out.println("your password os "+password);
	}
	public void login(String password, long PhoneNumber) {
		System.out.println("Your Password is "+password);
		System.out.println("Your Phone number is "+ PhoneNumber);
	}
	public void add(int x,int y) {
		System.out.println(x+y);
	}
	public void add(int x,int y,int z) {
		System.out.println(x+y+z);
	}
	public static void main(String[] args) {
		MethodOverload ob = new MethodOverload();
		ob.login("Hemanth", "Hemanth@123");
		ob.login("Hemanth@123", 88612418401l);
		System.out.println("Methon overload with different number of parameter");
		ob.add(2,5);
		ob.add(5,5,5 );
	}

}
