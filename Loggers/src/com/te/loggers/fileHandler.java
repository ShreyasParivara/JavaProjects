package com.te.loggers;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class fileHandler {
	public static final Logger LOGGER = Logger.getLogger(fileHandler.class.getName());

	public static void main(String[] args) throws Exception, IOException {
		FileHandler filehandler = new FileHandler("C:\\Users\\shreyas\\Desktop\\Myhandler\\log.log");
		Formatter formatter = new Myformatter();
		filehandler.setFormatter( formatter);
		LOGGER.addHandler(filehandler);
		
		LOGGER.setLevel(Level.FINE);
		LOGGER.finest("I am from the finest");
		LOGGER.finer("I am from the finer");
		LOGGER.fine("I am from the fine");
		LOGGER.config("I am from the config");
		LOGGER.info("I am from the info");
		LOGGER.warning("I am from the warning");
		LOGGER.severe("I am from the severs");
		
		
	}

}
