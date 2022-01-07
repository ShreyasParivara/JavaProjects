package com.te.challenges;

import java.util.Scanner;

public class SimpleCalculactor {

	double firstNumber;
	double secondNumber;

	double getFirstNumber() {
		return firstNumber;

	}

	void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;

	}

	double getSecondNumber() {
		return secondNumber;

	}

	void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;

	}

	double getAdditionResult() {
		return firstNumber + secondNumber;
	}

	double getSubstractionResult() {
		return firstNumber - secondNumber;
	}

	double getMultiplicaionResult() {
		return firstNumber * secondNumber;
	}

	double getDivisionResult() {
		return firstNumber / secondNumber;
	}

	public static void main(String[] args) {
		SimpleCalculactor simplecalc = new SimpleCalculactor();
		Scanner scanner = new Scanner(System.in);
		double firstNumber;
		double secondNumber;
		System.out.println("Enter First Number");
		firstNumber = scanner.nextDouble();
		simplecalc.setFirstNumber(firstNumber);
		System.out.println("Enter Second Number");
		secondNumber = scanner.nextDouble();
		simplecalc.setSecondNumber(secondNumber);
		System.out.println("Your Entered Number are");
		System.out.println(simplecalc.getFirstNumber());
		System.out.println(simplecalc.getSecondNumber());
		System.out.println("Addition Result: " + simplecalc.getAdditionResult());
		System.out.println("Substraction Result: " + simplecalc.getSubstractionResult());
		System.out.println("Multiplication Result: " + simplecalc.getMultiplicaionResult());
		System.out.println("Division Result: " + simplecalc.getDivisionResult());

	}

}
