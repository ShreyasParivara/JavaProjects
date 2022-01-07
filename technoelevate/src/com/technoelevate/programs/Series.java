package com.technoelevate.programs;
import java.util.Scanner;
public class Series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of A");
		int a=sc.nextInt();
		System.out.println("Enter value of B");
		int b=sc.nextInt();
		System.out.println("Enter value for N");
		int n=sc.nextInt();
		double sum=(a+(Math.pow(2,0)*b));
		System.out.print(sum+",");
		for(int i=1;i<n;i++) {
			sum=sum+((Math.pow(2,i)*b));
			System.out.print(" "+sum+",");
			
		}
		 
		
	

	}

}
