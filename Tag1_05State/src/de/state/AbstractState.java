package de.state;

public class AbstractState implements State{
	
	private final Fassade fassade;

	public AbstractState(Fassade fassade) {
		this.fassade = fassade;
	}

	public Fassade getFassade() {
		return fassade;
	}

	@Override
	public void print() {
		throw new UnsupportedOperationException("Diese Funtion macht in diesem Status keinen Sinn!");
		
	}

	@Override
	public void changeToA() {
		throw new UnsupportedOperationException("Diese Funtion macht in diesem Status keinen Sinn!");
		
	}

	@Override
	public void changeToB() {
		throw new UnsupportedOperationException("Diese Funtion macht in diesem Status keinen Sinn!");
		
	}
	
	

}
