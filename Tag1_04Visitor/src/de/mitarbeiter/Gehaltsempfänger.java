package de.mitarbeiter;

import de.mitarbeiter.visitors.MitarbeiterVisitor;

public class Gehaltsempf�nger extends AbstractMitarbeiter {
	
	private double gehalt;

	public Gehaltsempf�nger() {
		// TODO Auto-generated constructor stub
	}

	public Gehaltsempf�nger(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public double getGehalt() {
		return gehalt;
	}

	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gehaltsempf�nger [gehalt=");
		builder.append(gehalt);
		builder.append(", getName()=");
		builder.append(getName());
		builder.append("]");
		return builder.toString();
	}
	
	
	@Override
	public void accept(MitarbeiterVisitor visitor) {
		visitor.visit(this);
		
	}

}
