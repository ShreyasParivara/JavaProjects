package com.te.array;

import java.util.Scanner;

import com.te.abstraction.main;

public class Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("enter the array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 3 &&  a[i + 1] != 3 ) {
				count++;
			}
		}
		if (count == 3)
			System.out.println(true);
		else
			System.out.println(false);

	}
}
