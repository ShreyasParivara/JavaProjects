package com.te.loggers;

import java.io.Console;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger {
	public static final Logger LOGGER = Logger.getLogger(MyLogger.class.getName());
	

	public static void main(String[] args) {
		ConsoleHandler consolehandler = new ConsoleHandler();//creating handler , without handler logger cannot set levels,first tap 
		consolehandler.setLevel(Level.FINEST);
		LOGGER.addHandler(consolehandler);//informing logger that which handler is used 
		LOGGER.setLevel(Level.FINE); //here logger is setting level , acts as second tap
		
		LOGGER.finest("I am from the finest");
		LOGGER.finer("I am from the finer");
		LOGGER.fine("I am from the fine");
		LOGGER.config("I am from the config");
		LOGGER.info("I am from the info");
		LOGGER.warning("I am from the warning");
		LOGGER.severe("I am from the severs");
		

	}

}
