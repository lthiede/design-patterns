package de.main;

import de.firma.Firma;
import de.listeners.AddListener;
import de.listeners.ChangeListener;
import de.mitarbeiter.GehaltsEmpfaenger;
import de.mitarbeiter.LohnEmpfaenger;
import de.mitarbeiter.vistors.PrintVisitor;
import de.mitarbeiter.vistors.StatistikVisitor;

public class Main {

	public static void main(String[] args) {

		Firma firma = new Firma();
		AddListener addListener = new AddListener();
		ChangeListener changeListener = new ChangeListener();

		/*
		Add listeners to the list of listeners
		The Lambda Expressions implement the function EmployeeNumberChangedListener interface
		 */
		firma.addEmployeeNumberChangedListener(e->addListener.greetAddedEmployee(e));
		firma.addEmployeeNumberChangedListener(e->changeListener.updateEmployeeNumber(e));

		GehaltsEmpfaenger schmidt = new GehaltsEmpfaenger("Schmidt");
		GehaltsEmpfaenger mayer = new GehaltsEmpfaenger("Mayer");
		GehaltsEmpfaenger schulz = new GehaltsEmpfaenger("Schulz");
		LohnEmpfaenger hinz = new LohnEmpfaenger("hinz");
		LohnEmpfaenger kunz = new LohnEmpfaenger("kunz");

		firma.add(schmidt);
		firma.add(mayer);
		firma.remove(schmidt);
		firma.add(hinz);
		firma.add(kunz);
		firma.remove(hinz);
		firma.add(schulz);
		firma.remove(mayer);

		firma.iterate(new PrintVisitor());

		firma.iterate(new StatistikVisitor()); // Aufgabe 3: Statistik Visitor aus

	}

}
