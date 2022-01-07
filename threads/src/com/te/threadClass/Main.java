package com.te.threadClass;

public class Main {

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.start();
		for ( int i = 11; i < 20; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
