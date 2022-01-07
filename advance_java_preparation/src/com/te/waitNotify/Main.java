package com.te.waitNotify;

public class Main {

	public static void main(String[] args) {
		Demo demo = new Demo();
		Thread1 thread1 = new Thread1(demo);
		Thraed2 thread2 = new Thraed2(demo);
		thread1.setPriority(10);
		thread1.start();
		thread2.start();
		

	}

}
