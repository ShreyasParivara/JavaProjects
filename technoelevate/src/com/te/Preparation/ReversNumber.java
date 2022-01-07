package com.te.Preparation;

import java.util.Scanner;

class ReversNumber{
    public static void main(String[] args){
        int array[] = new int [5];
	int array2[] = new int [5];
	Scanner sc = new Scanner(System.in);
	int j = 0;
	
	System.out.println("Enter the array element");
	for(int i = 0; i < array.length; i++){
	    array[i] = sc.nextInt();
	}

	for(int i = array.length-1; i >= 0; i--){
	   array2[j] = array[i];
	}
	
	
	
	   
    }
}   