package com.te.abstraction;

public class Owner {

	public static void main(String[] args) {
		Bruclee ob  = new Bruclee(4,35,"lab");
		ob.bark();
		ob.bite();
		ob.eat();
		ob.poop();
		System.out.println("age= "+ob.age);
		System.out.println("weight= "+ob.weight);
		System.out.println("breed= "+ob.breed);
		System.out.println("**********");
		Simbha ob1 = new Simbha(3,10,"pamorrien");
		ob1.bark();
		ob1.bite();
		ob1.eat();
		ob.poop();
		System.out.println("age= "+ob1.age);
		System.out.println("weight= "+ob1.weight);
		System.out.println("breed= "+ob1.breed);
		
	}

}
