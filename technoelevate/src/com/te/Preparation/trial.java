package com.te.Preparation;

import java.util.Scanner;

public class trial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array length");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the array");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();

		}
		int temp;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			
		}
		for(int  x:a) {
			System.out.println(x);
		}
		

		System.out.println("largest "+a[size-1]);
	}
}
