package com.te.exception;

public class CustomExceptionCall {
	 public void m1() {
		 System.out.println("Exception method");
		 throw new CustomException("Custom Exception constructor");
	 }
	 

	public static void main(String[] args) {
		CustomExceptionCall c = new CustomExceptionCall();
		try{
			c.m1();
		}catch (CustomException e) {
			System.out.println(e.message);
		}

	}

}
