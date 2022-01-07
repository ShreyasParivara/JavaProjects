package com.te.synchronizedex;

public class Users {

	public static void main(String[] args) {
		TicketBooking tb = new TicketBooking();
		Passenger vamshi = new Passenger(tb, 10, "vamshi");
		Passenger bushan = new Passenger(tb, 5, "bushan");
		Passenger siddesh = new Passenger(tb, 12,"Siddesh");
		vamshi.start();
		bushan.start();
		siddesh.start();

	}

}
