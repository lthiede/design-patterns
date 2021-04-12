package pattern.state;

public class AbstractState implements State{
	
	private final Ampel ampel;

	public AbstractState(Ampel ampel) {
		this.ampel = ampel;
	}

	public Ampel getAmpel() {
		return ampel;
	}

	// overwrite state interface and set defaults
	// Aufgabe 1
	@Override
	public String getActualColor() {
		throw new UnsupportedOperationException("this function is not available in this state");}
	@Override
	public void nextColor() {
		throw new UnsupportedOperationException("this function is not available in this state");
	}
	// Aufgabe 2
	@Override
	public void switchOn() {
		throw new UnsupportedOperationException("this function is not available in this state");
	}
	@Override
	public void switchOff() {
		throw new UnsupportedOperationException("this function is not available in this state");
	}

}
