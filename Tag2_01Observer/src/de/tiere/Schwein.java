package de.tiere;

import java.util.ArrayList;
import java.util.List;

public class Schwein {
	
	private static final int SCHLACHT_GEWICHT = 20;
	private List<PigTooFatListener> pigTooFatListeners = new ArrayList<>();
	
	public void addPigTooFatListener(PigTooFatListener listener) {
			pigTooFatListeners.add(listener);
	}
	
	public void removePigTooFatListener(PigTooFatListener listener) {
		pigTooFatListeners.remove(listener);
	}
	
	private void firePigTooFatEvent() {
//		for (PigTooFatListener listener : pigTooFatListeners) {
//			listener.pigTooFat(this);
//		}
		
		pigTooFatListeners.forEach(listener->listener.pigTooFat(this));
	}
	
	
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
		if(this.gewicht > SCHLACHT_GEWICHT)
			firePigTooFatEvent();
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
