package com.te.array;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int n=sc.nextInt();
		int x=1;
		int y=1;
		int sum;
		System.out.print(x+" "+y);
		for(int i=2;i<n;i++) {
			sum=x+y;
			x=y;
			y=sum;
			System.out.print(" "+sum);
		}
		

	}

}
