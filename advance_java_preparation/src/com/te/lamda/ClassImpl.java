package com.te.lamda;

public class ClassImpl {

	public static void main(String[] args) {
		InterfaceDemo i = (a,b)->{
			System.out.println("Interface implemented "+a+" "+b);
		};
		i.show(25,35);
		
	}

}
