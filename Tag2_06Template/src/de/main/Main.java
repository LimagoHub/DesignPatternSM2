package de.main;

import de.processor.CharacterCounter;
import de.processor.FileKopierer;
import de.processor.FileProcessor;
import de.processor.LineCounter;

public class Main {

	public static void main(String[] args) {
		FileProcessor processor = new FileProcessor();
		
		processor.addCharacterHandler(new CharacterCounter());
		processor.addCharacterHandler(new FileKopierer());
		processor.addCharacterHandler(new LineCounter());
		processor.run("prosa.txt");
		
	}

}
