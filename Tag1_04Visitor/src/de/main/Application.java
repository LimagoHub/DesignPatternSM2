package de.main;

import de.firma.Firma;
import de.mitarbeiter.Gehaltsempfänger;
import de.mitarbeiter.Lohnempfänger;
import de.mitarbeiter.visitors.PrintVisitor;

public class Application {

	public static void main(String[] args) {
		Firma firma = new Firma();
		
		firma.addMitarbeiter(new Gehaltsempfänger("Müller"));
		firma.addMitarbeiter(new Gehaltsempfänger("Mayer"));
		firma.addMitarbeiter(new Lohnempfänger("Hinz"));
		firma.addMitarbeiter(new Lohnempfänger("Kunz"));
		firma.addMitarbeiter(new Gehaltsempfänger("Schmidt"));
		
		firma.iterate(new PrintVisitor());

	}

}
