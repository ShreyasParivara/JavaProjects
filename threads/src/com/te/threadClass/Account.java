 package com.te.threadClass;

public class Account {
	

	public Account(int balance) {
		super();
		this.balance = balance;
	}                                                        
	int balance;
	synchronized public void deposit(int amount) {
		balance+=amount;
	}
	public void withdraw(int amount) {
		if(balance<amount)
			System.out.println("Insufficient balance");
		else
			balance-=amount;
	}
	public void checkBalance() {
		System.out.println(balance);
	}
	

}
