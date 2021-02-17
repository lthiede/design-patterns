package de.application;

import de.client.CalcClient;
import de.math.Calculator;
import de.math.CalculatorImpl;
import de.math.CalculatorLogger;
import de.math.CalculatorSecure;

public class Application {
	
	
	private static boolean logger = true;
	private static boolean secure = true;

	public static void main(String[] args) {

		
		Calculator calculator = new CalculatorImpl();
		
		if(logger)               
			calculator = new CalculatorLogger(calculator);
		
		if(secure)
			calculator = new CalculatorSecure(calculator);
				
				
	
		CalcClient client = new CalcClient(calculator);
		
		client.run();

	}

}
