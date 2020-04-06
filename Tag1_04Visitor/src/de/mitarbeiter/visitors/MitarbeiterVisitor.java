package de.mitarbeiter.visitors;

import de.mitarbeiter.Gehaltsempf�nger;
import de.mitarbeiter.Lohnempf�nger;

public interface MitarbeiterVisitor {
	
	void visit(Lohnempf�nger lohnempf�nger);
	void visit(Gehaltsempf�nger gehaltsempf�nger);

}
