package de.client;

import de.math.Calculator;

public class CalcClient {
	
	public final Calculator calculator;
	
	

	public CalcClient(final Calculator calculator) {
		this.calculator = calculator;
	}



	public void run() {
		
		System.out.println(calculator.add(3, 4));

	}

}
