package de.mitarbeiter.vistors;

import de.mitarbeiter.GehaltsEmpfaenger;
import de.mitarbeiter.LohnEmpfaenger;


public abstract class AbstractMitarbeiterVisitor implements MitarbeiterVisitor{


	@Override
	public void vistit(GehaltsEmpfaenger gehaltsEmpfaenger) {
		// Ok

	}

	@Override
	public void vistit(LohnEmpfaenger lohnEmpfaenger) {
		// Ok

	}

}
