package de.main;

import de.tiere.Schwein;
import de.tiere.SchweineMemento;

public class Main {

	public static void main(String[] args) {
		Schwein piggy = new Schwein("Miss Piggy");
		
		System.out.println(piggy);
		
		// Zustand speichern
		SchweineMemento memento = piggy.getMemento();
		
		
		piggy.fressen();
		
		System.out.println(piggy);
		
		// Zustand widerherstellen
		piggy.setMemento(memento);
		
		System.out.println(piggy);
	}

}
