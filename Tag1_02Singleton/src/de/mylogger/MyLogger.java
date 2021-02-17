package de.mylogger;

public class MyLogger {
	
	private static MyLogger instance = new MyLogger();
	
	
		
	public static MyLogger getInstance() {
//		if(instance == null)
//			instance = new MyLogger();
		return instance;
	}

	public static void setInstance(MyLogger instance) {
		MyLogger.instance = instance;
	}

	private MyLogger() {
		
	}
	
	public void log(String message) {
		System.out.println(message);
	}

}
