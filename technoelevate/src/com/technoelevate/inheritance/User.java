package com.technoelevate.inheritance;
public class User {
	public static void main(String[] args) {
		MessageRead MessageRead = new MessageRead();
		MessageRead.text();
		MessageRead.textReceived();
		MessageRead.msgRead();
		System.out.println("---------");
		MessageReceived messagerecived=new MessageReceived();
		messagerecived.text();
		messagerecived.textReceived();
	}
}
