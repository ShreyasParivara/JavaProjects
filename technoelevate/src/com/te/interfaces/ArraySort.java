package com.te.interfaces;

public class ArraySort {

	public static void main(String[] args) {
		int a[] = {4,2,6,7,8,6,5};
		int size = a.length;
		int temp;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}	
			}
		}
		for(int x : a) {
			System.out.print(x+" ");
		}



	}

}
