package de.mitarbeiter.vistors;

import de.mitarbeiter.GehaltsEmpfaenger;
import de.mitarbeiter.LohnEmpfaenger;


public class PrintVisitor extends AbstractMitarbeiterVisitor {

	@Override
	public void visit(GehaltsEmpfaenger gehaltsEmpfaenger) {
		System.out.println(gehaltsEmpfaenger);
		
	}

	@Override
	public void visit(LohnEmpfaenger lohnEmpfaenger) {
		System.out.println(lohnEmpfaenger);
		
	}

}
