package de.processor;

import java.io.FileReader;

public abstract class AbstractFileProcessor {
	
	
	
	public final void run(String filename) {
		try(FileReader reader = new FileReader(filename)) {
			
			init();
			
			int c;
			
			while((c=reader.read()) != -1) {
				process((char) c);
			}
			
			close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void init() {
		
	}
	
	public abstract void process(char c) ;
	
	public void close() {
		
	}

}
