package de.processor;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {
	
	private List<CharacterHandler> handlers = new ArrayList<CharacterHandler>();
	
	public void addCharacterHandler(CharacterHandler handler) {
		handlers.add(handler);
	}
	
	public void removeCharacterHandler(CharacterHandler handler) {
		handlers.remove(handler);
	}

	public final void run(String filename) {
		try (FileReader reader = new FileReader(filename)) {

			init();

			int c;

			while ((c = reader.read()) != -1) {
				process((char) c);
			}

			close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void init() {
		for (CharacterHandler handler : handlers) {
			handler.init();
		}
	}

	private void process(char c) {
		for (CharacterHandler handler : handlers) {
			handler.process(c);
		}

	};

	private void close() {
		for (CharacterHandler handler : handlers) {
			handler.close();
		}
	}

}
