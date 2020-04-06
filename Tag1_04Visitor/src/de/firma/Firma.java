package de.firma;

import java.util.ArrayList;
import java.util.List;

import de.mitarbeiter.AbstractMitarbeiter;
import de.mitarbeiter.Gehaltsempfänger;
import de.mitarbeiter.Lohnempfänger;
import de.mitarbeiter.visitors.MitarbeiterVisitor;

public class Firma {

	private List<AbstractMitarbeiter> mitarbeiters = new ArrayList<>();

	public boolean addMitarbeiter(AbstractMitarbeiter e) {
		return mitarbeiters.add(e);
	}

	public boolean removeMitarbeiter(AbstractMitarbeiter o) {
		return mitarbeiters.remove(o);
	}

//	public void print() {
//		//mitarbeiters.forEach(System.out::println);
//		
//		for (AbstractMitarbeiter mitarbeiter : mitarbeiters) {
//			System.out.println(mitarbeiter);
//		}
//	}
//	

	public void iterate(MitarbeiterVisitor visitor) {
		for (AbstractMitarbeiter mitarbeiter : mitarbeiters) {
			//visitor.visit(mitarbeiter);
			
			
			
			mitarbeiter.accept(visitor);
		}
	}
}
