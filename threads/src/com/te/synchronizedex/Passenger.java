package com.te.synchronizedex;

public class Passenger extends Thread {
	int noOfTickets;
	TicketBooking ticket;
	String name;

	public Passenger(TicketBooking ticket, int noOfTickets, String name) {
		this.noOfTickets = noOfTickets;
		this.ticket = ticket;
		this.name = name;
	}

	@Override
	public void run() {
		ticket.bookTicket(noOfTickets, name);

	}

}
