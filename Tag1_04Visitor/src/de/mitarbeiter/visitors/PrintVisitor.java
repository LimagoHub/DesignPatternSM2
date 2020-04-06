package de.mitarbeiter.visitors;

import de.mitarbeiter.Gehaltsempf�nger;
import de.mitarbeiter.Lohnempf�nger;

public class PrintVisitor implements MitarbeiterVisitor {

	@Override
	public void visit(Lohnempf�nger lohnempf�nger) {
		System.out.println(lohnempf�nger);

	}

	@Override
	public void visit(Gehaltsempf�nger gehaltsempf�nger) {
		System.out.println(gehaltsempf�nger);

	}

}
