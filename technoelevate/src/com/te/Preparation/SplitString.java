package com.te.Preparation;

public class SplitString {
	
	
	public static void main(String[] args) {
		String string = "Hello world";
		int size = string.length();
		char result[] = new char[size*2];
		int i =0;
		int j =0;
		while (j<size-1) {
			if (j%2==0) {
				result[i]=' ';
			    j++;}
			    else {
			    	result[i]=string.charAt(i);
			    	i++;
			    }
		}
		String s = new String(result);
		System.out.println(s);
	}

}
