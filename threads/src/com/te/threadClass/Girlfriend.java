package com.te.threadClass;

public class Girlfriend extends Thread {
Account account;
	
	public Girlfriend(Account account) {
		super();
		this.account = account;
	}
	
	public void run() {
		for(int i =0; i<10;i++) {
			account.deposit(10);
		}
		System.out.println("Girlfriend deposit completed");
	}
	


}
