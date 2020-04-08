package de.tiere;

import java.util.ArrayList;
import java.util.List;

import de.events.PropertyChangedEvent;
import de.events.PropertyChangedListener;

public class Schwein {

	private static final int SCHLACHT_GEWICHT = 20;
	private List<PigTooFatListener> pigTooFatListeners = new ArrayList<>();
	private List<PropertyChangedListener> propertyChangedListeners = new ArrayList<>();

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

		pigTooFatListeners.forEach(listener -> listener.pigTooFat(this));
	}

	public void addPropertyChangedListener(PropertyChangedListener listener) {
		propertyChangedListeners.add(listener);

	}

	public void removePropertyChangedListener(PropertyChangedListener listener) {
		propertyChangedListeners.remove(listener);
	}

	private void firePropertyChangedEvent(PropertyChangedEvent event) {
		for (PropertyChangedListener listener : propertyChangedListeners) {
			listener.propertyChanged(event);
		}
	}

	private void firePropertyChangedEvent(String propertyName, Object oldValue, Object newValue) {
		firePropertyChangedEvent(new PropertyChangedEvent(this, propertyName, oldValue, newValue));
	}

	private String name;
	private int gewicht;

	public Schwein() {
		this("Nobody");
	}

	public Schwein(String name) {
		this.gewicht = 10;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		String oldValue = this.name;
		this.name = name;
		if (! oldValue.equals(this.name))
			firePropertyChangedEvent("name", oldValue, name);
	}

	public int getGewicht() {
		return gewicht;
	}

	private void setGewicht(int gewicht) {
		int oldValue = this.gewicht;
		this.gewicht = gewicht;
		if (oldValue != gewicht)
			firePropertyChangedEvent("gewicht", oldValue, gewicht);

		if (this.gewicht > SCHLACHT_GEWICHT)
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
