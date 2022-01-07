package com.te.waitNotify;

public class Thread1 extends Thread {
	Demo demo;
	public Thread1(Demo demo) {
		super();
		this.demo = demo;
	}
	@Override
	public void run() {
		demo.method1();
	}
	

}
