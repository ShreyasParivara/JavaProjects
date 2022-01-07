package com.te.threadSynchronized;

public class Irctc {
	static int ticket = 20;

	 public void book(int number) {
		System.out.println("welcome");
		
		synchronized(this) { if (ticket < number) {
			System.out.println("Ticket not booked");

		} else {
			System.out.println("ticket booked");
			ticket=ticket - number;
			System.out.println("ticket left is "+ticket);
		}
	}}

}
