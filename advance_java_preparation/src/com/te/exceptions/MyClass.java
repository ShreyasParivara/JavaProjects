package com.te.exceptions;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id");
		int id = sc.nextInt();
		try {
			if (id <= 0)
				throw new MyException();
			else
				System.out.println("valid");
		} catch (MyException e) {
			System.out.println("Enter the valid id");
		}

	}

}
