package de.main;

import de.client.CalcClient;
import de.math.Calculator;
import de.math.CalculatorImpl;
import de.math.CalculatorLogger;
import de.math.CalculatorSecure;

public class Application {

	public static void main(String[] args) {
		
		Calculator calculator = new CalculatorImpl(); // an Adresse 1000
		
		calculator = new CalculatorLogger(calculator); // an Adresse 2000
		
		calculator = new CalculatorSecure(calculator); // an Adresse 3000
		
		CalcClient client = new CalcClient(calculator);
		
		
		client.run();
	}

}
