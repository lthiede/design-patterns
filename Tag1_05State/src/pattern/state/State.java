package pattern.state;

public interface State {

	// Aufgabe 1
	public String getActualColor();
	public void nextColor();
	// Aufgabe 2
	public void switchOn();
	public void switchOff();

}
