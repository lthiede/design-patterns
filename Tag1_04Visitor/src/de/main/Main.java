package de.main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import de.firma.Firma;
import de.mitarbeiter.GehaltsEmpfänger;
import de.mitarbeiter.LohnEmpfänger;
import de.mitarbeiter.vistors.PrintVisitor;

public class Main {

	public static void main(String[] args) {
		
		
		List<String> liste = Arrays.asList("eins","zwei","drei","vier");
		
		
		liste.forEach(System.out::println);
		
		
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
