package com.te.exception;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked {
	public static void main(String[] args) {
		try {
			FileReader file =new FileReader("C:\\Users\\shreya");
		}catch(FileNotFoundException e) {
			System.out.println("file not found");
		}
	}
	
	

}
 