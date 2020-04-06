package de.state;

public class StateA extends AbstractState {

	public StateA(Front front) {
		super(front);
	}

	@Override
	public void drucken() {
		System.out.println("Hier druckt a");
	}

	@Override
	public void changeToB() {
		getFront().current = getFront().stateB;
	}

	
	
}
