package de.mitarbeiter.vistors;

import de.mitarbeiter.GehaltsEmpfänger;
import de.mitarbeiter.LohnEmpfänger;

public class PrintVisitor implements MitarbeiterVisitor{

	@Override
	public void vistit(GehaltsEmpfänger gehaltsEmpfänger) {
		System.out.println(gehaltsEmpfänger);
		
	}

	@Override
	public void vistit(LohnEmpfänger lohnEmpfänger) {
		System.out.println(lohnEmpfänger);
		
	}

}
