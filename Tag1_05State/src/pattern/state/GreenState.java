package pattern.state;

public class GreenState extends AbstractState {

    public GreenState(Ampel ampel) {
        super(ampel);
    }

    // overwrite required base methods with greenState behavior
    // Aufgabe 1
    @Override
    public String getActualColor() {
        return "Green";
    }
    @Override
    public void nextColor() {
        getAmpel().activeState = getAmpel().redState;
    }
    // Aufgabe 2
    @Override
    public void switchOff() {
        getAmpel().activeState = getAmpel().offState;
    }
}
