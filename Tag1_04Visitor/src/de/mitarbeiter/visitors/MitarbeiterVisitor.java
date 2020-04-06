package de.mitarbeiter.visitors;

import de.mitarbeiter.Gehaltsempfänger;
import de.mitarbeiter.Lohnempfänger;

public interface MitarbeiterVisitor {
	
	void visit(Lohnempfänger lohnempfänger);
	void visit(Gehaltsempfänger gehaltsempfänger);

}
