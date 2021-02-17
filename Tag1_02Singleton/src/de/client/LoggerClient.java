package de.client;

import java.util.logging.Logger;

import de.mylogger.MyLogger;

public class LoggerClient {

	public static void main(String[] args) {
		MyLogger logger = MyLogger.getInstance();
		
		logger.log("Hallo");
		
		MyLogger logger2 = MyLogger.getInstance();
		
		System.out.println(logger == logger2);
		
		Logger echterLogger = Logger.getLogger("LoggerClient");
		echterLogger.info("Hallo");

	}

}
