package de.mitarbeiter.vistors;

import de.mitarbeiter.GehaltsEmpfänger;
import de.mitarbeiter.LohnEmpfänger;

public abstract class AbstractMitarbeiterVisitor implements MitarbeiterVisitor{


	@Override
	public void vistit(GehaltsEmpfänger gehaltsEmpfänger) {
		// Ok

	}

	@Override
	public void vistit(LohnEmpfänger lohnEmpfänger) {
		// Ok

	}

}
