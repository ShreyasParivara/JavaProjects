package com.te.Preparation;

public class MethodRecursion {
    static int n=1;
	public static void Recur() {
		if(n<=5)
		{
		System.out.println(n);	
		n++;
		Recur();
		}
	}
	public static void main(String[] args) {
		Recur();
	}
}
