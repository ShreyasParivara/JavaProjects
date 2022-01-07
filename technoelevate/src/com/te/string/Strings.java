package com.te.string;

public class Strings {

	public static void main(String[] args) {
		String s="My name is Shreyas";
		String name=s.toUpperCase();
		System.out.println(name);
		String a[]=name.split(" ",4);
		for(String x:a) {
			System.out.println(x);
		}
		String b = new String("hello");
		String c = new String("hello");
		System.out.println(b.equals(c));
		System.out.println(b==c);
		
	}

}
