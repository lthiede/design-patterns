package de.mitarbeiter.vistors;

import de.mitarbeiter.GehaltsEmpfaenger;
import de.mitarbeiter.LohnEmpfaenger;


public interface MitarbeiterVisitor {

	void finish(); // finish methode die nach Iteration aufgerufen wird, vgl. Firma.iterate ()
	void visit(GehaltsEmpfaenger gehaltsEmpfaenger);
	void visit(LohnEmpfaenger lohnEmpfaenger);
}
