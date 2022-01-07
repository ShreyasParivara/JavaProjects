package com.technoelevate.inheritance;
import java.util.Scanner;

public class Calculactor {
	public static double add(double a, double b) {
		return a+b;
	}
	public static double sub(double a, double b) {
		return a-b;
	}
	public static int multiply(int a, int b) {
		return a*b;
	}
	public static double divide(int a, int b) {
		return a/b;
	}
	public static int mod(int a,int b) {
		return a%b;
	}
	public static double gst(double amount, int gs) {
		return ((amount*gs)/100)+amount;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("***calculactor***");
		System.out.println("enter first number");
		
		System.out.println("addition= "+Calculactor.add(2, 2));
		System.out.println("substraction= "+Calculactor.sub(2, 2));
		System.out.println("miltiplication= "+Calculactor.multiply(2, 2));
		System.out.println("division= "+Calculactor.divide(2, 2));
		System.out.println("remainder= "+Calculactor.mod(2, 2));
		System.out.println("******gst calculaction******");
		System.out.println("enter price");
		double price=sc.nextDouble();
		System.out.println("enter gst perecentage");
		int gst= sc.nextInt();
		System.out.println("your total amount = "+ Calculactor.gst(price, gst));
		
		
	}
	
	
	

}
