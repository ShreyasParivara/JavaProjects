package com.technoelevate.inheritance;
import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		System.out.println("enter the year");
		Scanner ob = new Scanner(System.in);
		int year = ob.nextInt();
		System.out.println("enter the month");
		int month = ob.nextInt();
		if (((year%4==0) && (year%100!=0)) ||(year%400==0)) {
		
			System.out.println("it is a leap year");
			if(month==1|| month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
				System.out.println("31 days");
			else if(month==2)
				System.out.println("29 days");
			else
				System.out.println("30 days");
		}
		else 
		{
			System.out.println("not a leap year");
			if(month==1|| month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
			    System.out.println("31");
			else if(month==0)
				System.out.println("28 days");
			else
				System.out.println("30 days");
		}


}}
