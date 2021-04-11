package pattern.state;

public class OffState extends AbstractState {

    public OffState(Ampel ampel) {
        super(ampel);
    }

    // Aufgabe 2
    @Override
    public void switchOn() {
        getAmpel().activeState = getAmpel().redState;
    }
}
