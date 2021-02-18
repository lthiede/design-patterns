package de.main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import de.firma.Firma;
import de.mitarbeiter.GehaltsEmpfaenger;
import de.mitarbeiter.LohnEmpfaenger;
import de.mitarbeiter.vistors.PrintVisitor;

public class Main {

	public static void main(String[] args) {
		
		
			
		
		Firma firma = new Firma();
		
		firma.add(new GehaltsEmpfaenger("Schmidt"));
		firma.add(new GehaltsEmpfaenger("Mayer"));
		firma.add(new LohnEmpfaenger("Hinz"));
		firma.add(new LohnEmpfaenger("Kunz"));
		firma.add(new GehaltsEmpfaenger("Schulz"));

		//firma.print();
		firma.iterate(new PrintVisitor());
	}

}
