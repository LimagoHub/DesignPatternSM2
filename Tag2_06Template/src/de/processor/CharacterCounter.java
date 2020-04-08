package de.processor;

public class CharacterCounter implements CharacterHandler {
	
	private int counter;
	
	@Override
	public void init() {
		counter = 0;
	}

	@Override
	public void process(char c) {
		counter++;

	}
	
	@Override
	public void close() {
		System.out.println(counter);
	}

}
