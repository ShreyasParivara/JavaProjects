package com.te.Preparation;

class human {
	public void humanMethod() {
		System.out.println("A Human ");
	}
}

class Engineer extends human {

}

class animal {
	public void animalMethod() {
		System.out.println("An Animal");
	}
}

class dog extends animal {
}

public class GenericMethod {
	public static <T> void get(T h) {
		System.out.println(h);
		
	}

	public static void main(String[] args) {

		Engineer e = new Engineer();
		dog d = new dog();
		GenericMethod g = new GenericMethod();
		human h = new human();
		g.get(e);
		
		

	}

}