package com.te.hasarelationship;

public class Gamer {

	public static void main(String[] args) {
		Processor processor = new Processor("intel",4,2.4);
		HardDisk hardDisk = new HardDisk("wd",1,"ssd");
		Operating operating = new Operating("windows",11,64);
		Battery battery = new Battery(3000,3,"thoshiba");
		Laptop laptop = new Laptop(35000,battery,operating,hardDisk,processor);
		System.out.println(laptop);
	}
}
