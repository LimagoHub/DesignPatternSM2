package de.math;

public class CalculatorFactory {

	private static boolean logger=true;
	private static boolean secure=true;
	private static boolean benchmark=true;
	
	public static Calculator createInstance() {
		Calculator calculator = new CalculatorImpl(); // an Adresse 1000
		
		if(logger) calculator = new CalculatorLogger(calculator); // an Adresse 2000
		
		//calculator = (Calculator) LoggerProxy.newInstance(calculator); // Aspect AOP AspectJ
		
		if(secure) calculator = new CalculatorSecure(calculator); // an Adresse 3000
		
		if(benchmark) calculator = new CalculatorBenchmark(calculator); // an Adresse 4000
		
		return calculator;
	}
}
