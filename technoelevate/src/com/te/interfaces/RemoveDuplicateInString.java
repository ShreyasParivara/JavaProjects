package com.te.interfaces;

public class RemoveDuplicateInString {

	public static void main(String[] args) {
		String s = " heello woorldd";
		char str[] = s.toCharArray();
		int size = str.length;
		char str2[] = new char[size];
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (str[i] == str[j]) {
					int k = j;
					while (k < size - 1) {
						str[k] = str[k + 1];
						k++;
					}
					size--;
					j--;
				}
			}
			str2[i] = str[i];
		}
		String str3 = new String(str2);
		System.out.println(str3);
	}
}
