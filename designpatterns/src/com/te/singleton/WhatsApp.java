package com.te.singleton;

public class WhatsApp {
	private static WhatsApp whatsapp;
	private WhatsApp() {
		
	}
	
	static WhatsApp helperMethod() {
		if(whatsapp == null) {
			whatsapp = new WhatsApp();
			return whatsapp;
		}
		return whatsapp;
		
	}

}
