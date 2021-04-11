package pattern.state;

public class Ampel {

    // Aufgabe 1
    protected final State redState = new RedState(this);
    protected final State greenState = new GreenState(this);

    //Aufgabe 2
    protected final State offState = new OffState(this);

    protected State activeState = redState; // start with redState

    // Aufgabe 1
    public String getActualColor() {
        return activeState.getActualColor();
    }
    public void nextColor() {
        activeState.nextColor();
    }

    // Aufgabe 2
    public void switchOn() {
        activeState.switchOn();
    }
    public void switchOff() {
        activeState.switchOff();
    }

}
