package com.te.threadClass;

public class Boyfriend extends Thread {
	Account account;
	
	public Boyfriend(Account account) {
		super();
		this.account = account;
	}
	
	public void run() {
		for(int i =0; i<100;i++) {
			account.deposit(200);
		}
		System.out.println("Boyfriend deposit completed");
	}
	

}
