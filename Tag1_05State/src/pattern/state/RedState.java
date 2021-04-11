package pattern.state;

public class RedState extends AbstractState {

    public RedState(Ampel ampel) {
        super(ampel);
    }

    // Aufgabe 1
    @Override
    public String getActualColor() {
        return "Red";
    }
    @Override
    public void nextColor() {
        getAmpel().activeState = getAmpel().greenState;
    }
    // Aufgabe 2
    @Override
    public void switchOff() {
        getAmpel().activeState = getAmpel().offState;
    }
}
