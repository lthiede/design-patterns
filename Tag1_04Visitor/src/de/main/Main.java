package de.main;

import de.firma.Firma;
import de.mitarbeiter.GehaltsEmpfänger;
import de.mitarbeiter.LohnEmpfänger;
import de.mitarbeiter.vistors.PrintVisitor;

public class Main {

	public static void main(String[] args) {
		Firma firma = new Firma();
		
		firma.add(new GehaltsEmpfänger("Schmidt"));
		firma.add(new GehaltsEmpfänger("Mayer"));
		firma.add(new LohnEmpfänger("Hinz"));
		firma.add(new LohnEmpfänger("Kunz"));
		firma.add(new GehaltsEmpfänger("Schulz"));

		//firma.print();
		firma.iterate(new PrintVisitor());
	}

}
