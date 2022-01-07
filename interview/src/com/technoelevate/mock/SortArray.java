package com.technoelevate.mock;

public class SortArray {

	public static void main(String[] args) {
		int array[] = { 1, 12, 16, 3, 36 };

		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 0) {
				System.out.println(array[i]);
			}
		}
		
		
	}

}