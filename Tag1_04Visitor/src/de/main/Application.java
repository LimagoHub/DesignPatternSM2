package de.main;

import de.firma.Firma;
import de.mitarbeiter.Gehaltsempf�nger;
import de.mitarbeiter.Lohnempf�nger;
import de.mitarbeiter.visitors.PrintVisitor;

public class Application {

	public static void main(String[] args) {
		Firma firma = new Firma();
		
		firma.addMitarbeiter(new Gehaltsempf�nger("M�ller"));
		firma.addMitarbeiter(new Gehaltsempf�nger("Mayer"));
		firma.addMitarbeiter(new Lohnempf�nger("Hinz"));
		firma.addMitarbeiter(new Lohnempf�nger("Kunz"));
		firma.addMitarbeiter(new Gehaltsempf�nger("Schmidt"));
		
		firma.iterate(new PrintVisitor());

	}

}
