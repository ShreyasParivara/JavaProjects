package com.te.singleton;

public class User {

	public static void main(String[] args) {
		WhatsApp u1 = WhatsApp.helperMethod();
		System.out.println(u1);
		WhatsApp u2 = WhatsApp.helperMethod();
		System.out.println(u2);
		
		

	}

}
