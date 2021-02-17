package de.mitarbeiter.vistors;

import de.mitarbeiter.GehaltsEmpfänger;
import de.mitarbeiter.LohnEmpfänger;

public interface MitarbeiterVisitor {
	
	void vistit(GehaltsEmpfänger gehaltsEmpfänger);
	void vistit(LohnEmpfänger lohnEmpfänger);

}
