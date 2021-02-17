package de.state;

public class StateB extends AbstractState {

	public StateB(Fassade fassade) {
		super(fassade);
		
	}

	@Override
	public void print() {
		System.out.println("Hier druckt B");
	}

	@Override
	public void changeToA() {
		getFassade().current = getFassade().stateA;
	}

}
