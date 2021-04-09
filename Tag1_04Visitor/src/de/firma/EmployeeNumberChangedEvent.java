package de.firma;

import de.mitarbeiter.AbstractMitarbeiter;

public class EmployeeNumberChangedEvent {

    private Firma firma;
    private int change;

    public EmployeeNumberChangedEvent(Firma firma, int change) {
        this.firma = firma;
        this.change = change;
    }

    public int getChange() {
        return this.change;
    }

    public Firma getFirma() {
        return this.firma;
    }
}
