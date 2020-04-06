package de.mitarbeiter;

import de.mitarbeiter.visitors.MitarbeiterVisitor;

public class Lohnempf�nger extends AbstractMitarbeiter {
	
	private double arbeitszeit=30, stundenlohn=10;

	public Lohnempf�nger() {
		// TODO Auto-generated constructor stub
	}

	public Lohnempf�nger(String name) {
		super(name);
	}

	public double getArbeitszeit() {
		return arbeitszeit;
	}

	public void setArbeitszeit(double arbeitszeit) {
		this.arbeitszeit = arbeitszeit;
	}

	public double getStundenlohn() {
		return stundenlohn;
	}

	public void setStundenlohn(double stundenlohn) {
		this.stundenlohn = stundenlohn;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lohnempf�nger [arbeitszeit=");
		builder.append(arbeitszeit);
		builder.append(", stundenlohn=");
		builder.append(stundenlohn);
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
