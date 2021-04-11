package de.firma;

import de.mitarbeiter.AbstractMitarbeiter;

public class EmployeeNumberChangedEvent {

    private Firma firma;
    private int change;

    /*
     Initialise an event object, with two parameters:
     - the firma, that fires the event
     - the number of added employees (negative if removed)
     */
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
