package de.trafficLight.states;

public class TrafficLight {

	
	protected final TrafficLightStates greenLight = new GreenState(this);
	protected final TrafficLightStates redLight = new RedState(this);
	protected final TrafficLightStates offState = new OffState(this);
	protected TrafficLightStates current = offState;
	
	
	
	public String getColor() {
		return current.getColor();
	}
	public void nextColor() {
		current.nextColor();
	}
	public void switchOn() {
		current.switchOn();
	}
	public void switchOff() {
		current.switchOff();
	}
	
	

}
