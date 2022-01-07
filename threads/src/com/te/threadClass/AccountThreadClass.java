package com.te.threadClass;

public class AccountThreadClass {

	public static void main(String[] args) throws InterruptedException {
		Account account = new Account(1000);
		Boyfriend bf = new Boyfriend(account);
		Girlfriend gf = new Girlfriend(account);
		bf.start();
		gf.start();
		gf.join();
		bf.join();
		
		System.out.println("wait completed");
		account.checkBalance();

	}

}
