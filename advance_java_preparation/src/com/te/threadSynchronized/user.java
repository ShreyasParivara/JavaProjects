package com.te.threadSynchronized;

public class user {

		public static void main(String[] args) throws InterruptedException {
		Irctc irctc = new Irctc();
		App firstPerson = new App(irctc,10);
		App secondPerson = new App(irctc,5);
		App thirdPerson = new App(irctc,10);
		
		firstPerson.start();
		secondPerson.start();
		thirdPerson.start();
		

	}

}
