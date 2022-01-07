package com.te.exception;
import java.util.Scanner;

public class Exception {
	public static void main(String[] args) {
		int x;
		int y;
		int result;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first number");
		x=sc.nextInt();
		System.out.println("Enter the second number");
		y=sc.nextInt();
		 
		try {
			result = x/y;
			System.out.println(result);
			
		}catch(ArithmeticException e) {
			System.out.println("Infinite");
		}
		
	}

}
