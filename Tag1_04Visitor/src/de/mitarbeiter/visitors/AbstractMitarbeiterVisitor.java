package de.mitarbeiter.visitors;

import de.mitarbeiter.Gehaltsempf�nger;
import de.mitarbeiter.Lohnempf�nger;

public abstract class AbstractMitarbeiterVisitor implements MitarbeiterVisitor {

	@Override
	public void visit(Lohnempf�nger lohnempf�nger) {
		// ok
	}

	@Override
	public void visit(Gehaltsempf�nger gehaltsempf�nger) {
		// ok
	}

}
