package de.processor;

public class LineCounter implements CharacterHandler {
	
	private int counter = 0;
	
	@Override
	public void init() {
		counter = 0;
	}
	
	@Override
	public void close() {
		System.out.println(counter);
	}

	@Override
	public void process(char c) {
		if(c == '\n')
			counter ++;

	}

}
