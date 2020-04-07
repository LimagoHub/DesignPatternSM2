package de.math;

public class Calculator {
	
	private final static Calculator instance = new Calculator();
	
	public static Calculator getInstance() {
		return instance;
	}

	private Calculator() {
		memory = 0.0;
	}
	
	
	private double memory;

	public double getMemory() {
		return memory;
	}

	public void setMemory(double memory) {
		this.memory = memory;
	}
	
	public void add(double value) {
		memory += value;
	}

	public void sub(double value) {
		memory -= value;
	}

	public void mult(double value) {
		memory *= value;
	}

	public void div(double value) {
		memory /= value;
	}

	
	public void clear() {
		memory=0;
	}
	
	public void print() {
		System.out.println(memory);
	}


}
