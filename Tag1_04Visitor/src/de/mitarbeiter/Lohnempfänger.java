package de.mitarbeiter;

import de.mitarbeiter.visitors.MitarbeiterVisitor;

public class Lohnempfänger extends AbstractMitarbeiter {
	
	private double arbeitszeit=30, stundenlohn=10;

	public Lohnempfänger() {
		// TODO Auto-generated constructor stub
	}

	public Lohnempfänger(String name) {
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
		builder.append("Lohnempfänger [arbeitszeit=");
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
