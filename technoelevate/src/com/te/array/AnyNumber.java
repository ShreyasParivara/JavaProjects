package com.te.array;
import java.util.Scanner;
public class AnyNumber {
   
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many number you want to give");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);	
		}
		
	}
    	 
     
	
}
