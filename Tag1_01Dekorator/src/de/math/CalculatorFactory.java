package de.math;

public class CalculatorFactory {
	
	
	
	private static boolean logger = true;
	private static boolean secure = true;
	private static boolean benchmark = true;
	
	
	public static Calculator create() {
		Calculator retval = new CalculatorImpl();
		
		if(logger)               
			retval = new CalculatorLogger(retval);
		
		if(secure)
			retval = new CalculatorSecure(retval);
				
		if(benchmark)
			retval = new CalculatorBenchmark(retval);
				
		
		return retval;
	}

}
