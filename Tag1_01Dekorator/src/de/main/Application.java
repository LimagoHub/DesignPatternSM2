package de.main;

import java.time.Duration;
import java.time.Instant;

import de.client.CalcClient;
import de.common.LoggerProxy;
import de.math.Calculator;
import de.math.CalculatorBenchmark;
import de.math.CalculatorFactory;
import de.math.CalculatorImpl;
import de.math.CalculatorLogger;
import de.math.CalculatorSecure;

public class Application {

	public static void main(String[] args) {
		
		Calculator calculator = CalculatorFactory.createInstance();
		
	
		
		CalcClient client = new CalcClient(calculator);
		
		
		client.run();
		
	
		
	}

}
