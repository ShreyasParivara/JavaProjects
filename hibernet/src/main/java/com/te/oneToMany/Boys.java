package com.te.oneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Boys {
	@Id
	private int bid;
	
	private String name;
	
	private double balance;
	
	@ManyToOne
	private Girls girl;
	
	public Girls getGirl() {
		return girl;
	}
	public void setGirl(Girls girl) {
		this.girl = girl;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Boy [bid=" + bid + ", name=" + name + ", balance=" + balance + "]";
	}
	

}
