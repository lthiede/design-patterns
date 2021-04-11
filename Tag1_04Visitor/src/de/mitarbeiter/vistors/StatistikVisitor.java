package de.mitarbeiter.vistors;

import de.mitarbeiter.GehaltsEmpfaenger;
import de.mitarbeiter.LohnEmpfaenger;

public class StatistikVisitor extends AbstractMitarbeiterVisitor {

    private int gehaltCount = 0; // counter Variablen für Gehalt und Lohn bezieher. mit 0 initiiert
    private int lohnCount = 0;

    @Override
    public void visit(GehaltsEmpfaenger gehaltsEmpfaenger) { // Implementation der Visit Methode Gehaltsempfänger -> gehaltCount erhöhen
        gehaltCount ++;
    }

    @Override
    public void visit(LohnEmpfaenger lohnEmpfaenger) { // Implementation der Visit Methode Lohnempfänger -> lohnCount erhöhen
        lohnCount ++;
    }

    public int getGehaltCount() {
        return gehaltCount;
    }

    public int getLohnCount() {
        return gehaltCount;
    }

    public int getGesamt() { // Gesamtanzahl beziehen
        return gehaltCount + lohnCount;
    }

    @Override // Implementation der Finish methode die nach Iteration ausgeführt wird. Printed Ergebnis
    public void finish() {
        System.out.println(this);
    }

    // custom print methode
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Anzahl der Gehaltsämpfänger: ");
        sb.append(gehaltCount);
        sb.append(" Anzahl der Lohnempäfnger: ");
        sb.append(lohnCount);
        sb.append(" Gesamtanzahl: ");
        sb.append(getGesamt());
        return sb.toString();
    }

}
