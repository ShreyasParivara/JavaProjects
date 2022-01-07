package com.technoelevate.inheritance;

public class B extends A {
	int a;
	int b;
	B(int x, int y, int a, int b){
		
		super(x,y);
		this.a=a;
		this.b=b;
	}
		
		
		
		
		public static void main(String[] args) {
			B obj = new B(1,2,3,4);
			System.out.println(obj.x);
			System.out.println(obj.y);
			System.out.println(obj.a);
			System.out.println(obj.b);
		
	}

}
