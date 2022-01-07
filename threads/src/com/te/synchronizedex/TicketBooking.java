package com.te.synchronizedex;

public class TicketBooking {
	int ticket = 20;

	public void bookTicket(int noOfTickets, String name) {
		System.out.println("Login Successfull");
		System.out.println("Welcome to IRCTC");
		System.out.println("Hello " + name);
		synchronized (this) {
			if (ticket < noOfTickets) {
				System.out.println("Tickets are not Available");
				System.out.println("===========================");
			} else {
				System.out.println("Ticket Booked");
				ticket -= noOfTickets;
				System.out.println("Number of tckets left " + ticket);
				System.out.println("============================");

			}
		}
		System.out.println("Thank you ! Please wear mask");
	}

}
