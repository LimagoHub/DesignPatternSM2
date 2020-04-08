package de.trafficLight.states;

public interface TrafficLightStates {

	String getColor();
	void nextColor();
	void switchOn();
	void switchOff();
}
