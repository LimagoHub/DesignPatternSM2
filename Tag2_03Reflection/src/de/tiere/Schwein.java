package de.tiere;

public class Schwein {
	
	
	private String name;
	private int gewicht;
	
	
	public Schwein() {
		this("Nobody");
	}
	public Schwein(String name) {
		this.gewicht =10;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGewicht() {
		return gewicht;
	}
	private void setGewicht(int gewicht) {
		this.gewicht = gewicht;
		
	}
	
	public void fressen() {
		setGewicht(getGewicht() + 1);
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Schwein [name=");
		builder.append(name);
		builder.append(", gewicht=");
		builder.append(gewicht);
		builder.append("]");
		return builder.toString();
	}

}
