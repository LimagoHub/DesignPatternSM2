package de.processor;

public class LineCounter extends AbstractFileProcessor {
	
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
