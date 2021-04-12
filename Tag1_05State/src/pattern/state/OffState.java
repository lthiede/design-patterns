package pattern.state;

public class OffState extends AbstractState {

    public OffState(Ampel ampel) {
        super(ampel);
    }

    // overwrite required base methods with offState behavior
    // Aufgabe 2
    @Override
    public void switchOn() {
        getAmpel().activeState = getAmpel().redState;
    }
}
