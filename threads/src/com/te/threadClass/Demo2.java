               package com.te.threadClass;

public class Demo2 extends Thread{
	public void run() {
		for( int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
			}
		}
	}
	

}
