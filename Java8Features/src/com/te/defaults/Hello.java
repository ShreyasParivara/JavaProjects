package com.te.defaults;

public class Hello {

	public static void main(String[] args) {
		PhonrCall call1 = new Karnataka();
		PhonrCall call2 = new TamilNadu();
		PhonrCall call3 = new Maharashtra();
		call1.busyMessage();
		call2.busyMessage();
		call3.busyMessage();
		System.out.println("=================");
		call1.coidAlert();
		call2.coidAlert();
		call3.coidAlert();
		
		
		

	}

}
