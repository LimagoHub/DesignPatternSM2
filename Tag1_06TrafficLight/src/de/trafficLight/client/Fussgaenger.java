package de.trafficLight.client;

import de.trafficLight.states.TrafficLight;

public class Fussgaenger {

	public static void main(String[] args) {
		TrafficLight trafficLight = new TrafficLight();
		trafficLight.switchOn();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(trafficLight.getColor());
			trafficLight.nextColor();
		}
	}

}
