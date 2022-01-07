package com.te.hasarelationship;

public class Engine {
	public int power;
	public int valve;
	
	public Engine(int power, int valve) {
		this.power = power;
		this.valve = valve;
	}

	@Override
	public String toString() {
		return "Engine [power=" + power + ", valve=" + valve + "]";
	}
	
}
