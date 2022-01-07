package com.te.spring.autowore;

public class HardDisk {
	public void setName(String name) {
		this.name = name;
	}

	String name;

	@Override
	public String toString() {
		return "HardDisk [name=" + name + "]";
	}

}
