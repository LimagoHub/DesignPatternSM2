package de.main;

import de.processor.AbstractFileProcessor;
import de.processor.CharacterCounter;
import de.processor.FileKopierer;
import de.processor.LineCounter;

public class Main {

	public static void main(String[] args) {
		AbstractFileProcessor processor = new CharacterCounter();
		processor.run("prosa.txt");
	}

}
