package de.math;

public class CalculatorFactory {
	
	
	
	private static boolean logger = true;
	private static boolean secure = true;
	
	
	public static Calculator create() {
		Calculator retval = new CalculatorImpl();
		
		if(logger)               
			retval = new CalculatorLogger(retval);
		
		if(secure)
			retval = new CalculatorSecure(retval);
				
		
		return retval;
	}

}
