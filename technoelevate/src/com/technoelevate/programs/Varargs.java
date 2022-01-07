package com.technoelevate.programs;

public class Varargs {
	public static int add(int ...a) {
		int result=0;
		for(int i=0;i<a.length;i++) {
			result+=a[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int sum=add(1,2,3,4,4,3);
		System.out.println(sum);

	}

}
