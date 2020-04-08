package de.trafficLight.states;

public class AbstractTrafficLightState implements TrafficLightStates {

	private final TrafficLight trafficLight;

	public AbstractTrafficLightState(TrafficLight trafficLight) {
		this.trafficLight = trafficLight;
	}

	public TrafficLight getTrafficLight() {
		return trafficLight;
	}

	@Override
	public String getColor() {
		throw new UnsupportedOperationException("Upps");
	}

	@Override
	public void nextColor() {
		throw new UnsupportedOperationException("Upps");
		
	}

	@Override
	public void switchOn() {
		throw new UnsupportedOperationException("Upps");
		
	}

	@Override
	public void switchOff() {
		throw new UnsupportedOperationException("Upps");
		
	}
	
	
	
}
