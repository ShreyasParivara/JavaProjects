package com.technoelevate.programs;

import java.util.Scanner;

public class Tables {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		System.out.println("Enter the Number till where you want the table");
		int n1=sc.nextInt();
		int result;
		int r=0;
		for(int i=1;i<=n1;i++) {
			result=n*i;
			System.out.println(n+"*"+i+"="+result);
			r=result+r;
		}
		System.out.println("Total sum= "+r);
	}

}
