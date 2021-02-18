package de.mitarbeiter.vistors;

import de.mitarbeiter.GehaltsEmpfaenger;
import de.mitarbeiter.LohnEmpfaenger;


public interface MitarbeiterVisitor {
	
	void vistit(GehaltsEmpfaenger gehaltsEmpfaenger);
	void vistit(LohnEmpfaenger lohnEmpfaenger);

}
