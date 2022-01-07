package com.te.string;

public class Reverse {

	public static void main(String[] args) {
		String s = "hello world";
		int size = s.length();
		char[] s1 = new char[size];
		int j=0;
		for (int i =size-1; i >= 0; i--) {
			s1[j] = s.charAt(i);
			j++;
		}
		String s2 = new String (s1);
		System.out.println(s1);
	}

}
