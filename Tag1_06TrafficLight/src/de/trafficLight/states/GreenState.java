package de.trafficLight.states;

public class GreenState extends AbstractTrafficLightColorState {

	public GreenState(TrafficLight trafficLight) {
		super(trafficLight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getColor() {
		return "green";
	}

	@Override
	public void nextColor() {
		getTrafficLight().current=getTrafficLight().redLight;
	}

	
	
}
