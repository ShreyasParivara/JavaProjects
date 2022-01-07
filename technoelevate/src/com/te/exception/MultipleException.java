package com.te.exception;

import java.util.Scanner;

public class MultipleException {
	public static void main(String[] args) {
		int x;
		int y;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first number");
		x=sc.nextInt();
		System.out.println("Enter the second number");
		y=sc.nextInt();
		int result;
		try {
			result=x/y;
		int[] arr=new int[result];
		arr[4]=50;
		System.out.println(arr[4]);
		System.out.println(result);
		}
		catch(ArithmeticException a) {
			System.out.println("Arithmetic Exception");
	}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array length is small");
		}

}


}
