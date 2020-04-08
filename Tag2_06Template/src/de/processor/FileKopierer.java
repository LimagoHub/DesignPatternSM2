package de.processor;

import java.io.FileWriter;
import java.io.IOException;

public class FileKopierer implements CharacterHandler {
	
	private FileWriter out;
	
	@Override
	public void init() {
		try {
			out = new FileWriter("kopie.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void close() {
		try {
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void process(char c) {
		try {
			out.write(c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
