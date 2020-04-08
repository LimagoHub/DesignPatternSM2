package de.trafficLight.states;

public class RedState extends AbstractTrafficLightColorState {

	public RedState(TrafficLight trafficLight) {
		super(trafficLight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getColor() {
		return "red";
	}

	@Override
	public void nextColor() {
		getTrafficLight().current=getTrafficLight().greenLight;
	}

	
	
}
