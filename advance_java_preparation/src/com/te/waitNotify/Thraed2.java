package com.te.waitNotify;

public class Thraed2 extends Thread {
	Demo demo;
	
	public Thraed2(Demo demo) {
		super();
		this.demo = demo;
	}

	@Override
	public void run() {
		demo.method2();
	}
	

}
