package de.mitarbeiter.visitors;

import de.mitarbeiter.Gehaltsempfänger;
import de.mitarbeiter.Lohnempfänger;

public abstract class AbstractMitarbeiterVisitor implements MitarbeiterVisitor {

	@Override
	public void visit(Lohnempfänger lohnempfänger) {
		// ok
	}

	@Override
	public void visit(Gehaltsempfänger gehaltsempfänger) {
		// ok
	}

}
