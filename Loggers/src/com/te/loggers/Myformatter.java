package com.te.loggers;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class Myformatter extends Formatter {

	@Override
	public String format(LogRecord record) {
		
		return record.getMessage()+":"+record.getSourceMethodName();
	}

}
