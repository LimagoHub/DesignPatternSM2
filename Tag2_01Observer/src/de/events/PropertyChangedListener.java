package de.events;

@FunctionalInterface
public interface PropertyChangedListener {
	
	void propertyChanged(PropertyChangedEvent event);

}
