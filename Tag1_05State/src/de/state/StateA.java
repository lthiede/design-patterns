package de.state;

public class StateA extends AbstractState {

	public StateA(Fassade fassade) {
		super(fassade);
		
	}

	@Override
	public void print() {
		System.out.println("Hier druckt A");
	}

	@Override
	public void changeToB() {
		getFassade().current = getFassade().stateB;
	}
	
	

}
