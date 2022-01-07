package com.te.Preparation;
import java.util.Scanner;

public class RemoveSpace {
	
	public static void main(String[] args){
		String string;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		string = sc.nextLine();
		System.out.println(string);
		int k ;
		int size = string.length();
		System.out.println(size);
		char charArray[] = string.toCharArray();
		char resultArray[] = new char[size];
		for (int i = 0; i < size; i++){
		    if (charArray[i] == ' '){
			k = i;
			while(k < size -1 ){
			    charArray[k] = charArray[k+1];
			    k++;    
			}
			size--;
		    }
		    resultArray[i]= charArray[i];
		}
		String result = new String(resultArray);
		System.out.println(result);	
	      }
	}		    
	


