package de.application;

import java.time.Duration;
import java.time.Instant;

import de.client.CalcClient;
import de.math.Calculator;
import de.math.CalculatorFactory;
import de.math.CalculatorImpl;
import de.math.CalculatorLogger;
import de.math.CalculatorSecure;

public class Application {
	
	
	

	public static void main(String[] args) {

		
		Instant start = Instant.now();
		
		// zu messende Operation
		
		
		Instant ende = Instant.now();
		
		Duration duration = Duration.between(start, ende);
		System.out.println(duration.toMillis());
		
		
		
		Calculator calculator = CalculatorFactory.create();
		
		
				
	
		CalcClient client = new CalcClient(calculator);
		
		client.run();

	}

}
