package com.te.Preparation;

public class StrinfBuffers {
	public void m1() {
		System.out.println("from m1");
	}

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello world");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		String s = "hello world";
		
		for( int i =0; i<s.length();i++) {
			System.out.print(s.charAt(i) + "  ");
		}
		String s1 = "h e l l o w o r l d";
		String s2 = s1.replaceAll("\\s","");
		System.out.println(s2);
		char c = '3';
		int a = c;
		System.out.println(c);
		StrinfBuffers b = new StrinfBuffers();
		StrinfBuffers b1 = b;
		System.out.println(b);
		System.out.println(b1);
		
	}

}