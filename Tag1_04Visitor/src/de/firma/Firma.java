package de.firma;

import java.util.ArrayList;
import java.util.List;

import de.mitarbeiter.AbstractMitarbeiter;
import de.mitarbeiter.vistors.MitarbeiterVisitor;

public class Firma {

	private List<EmployeeNumberChangedListener> listeners = new ArrayList<>();

	public boolean addEmployeeNumberChangedListener(EmployeeNumberChangedListener employeeNumberChangedListener) {
		return listeners.add(employeeNumberChangedListener);
	}

	public boolean removePigTooFatListener(EmployeeNumberChangedListener employeeNumberChangedListener) {
		return listeners.remove(employeeNumberChangedListener);
	}

	private void fireEmployeeNumberChangedEvent(int change) {
		EmployeeNumberChangedEvent employeeNumberChangedEvent = new EmployeeNumberChangedEvent(this, change);
		for (EmployeeNumberChangedListener listener : listeners) {
			listener.employeeNumberChanged(employeeNumberChangedEvent);
		}
	}

	private List<AbstractMitarbeiter> mitarbeiters = new ArrayList<>();

	public boolean add(AbstractMitarbeiter mitarbeiter) {
		fireEmployeeNumberChangedEvent(1);
		return mitarbeiters.add(mitarbeiter);
	}

	public boolean remove(AbstractMitarbeiter mitarbeiter) {
        fireEmployeeNumberChangedEvent(-1);
		return mitarbeiters.remove(mitarbeiter);
	}

	public void iterate(MitarbeiterVisitor visitor) {

		for (AbstractMitarbeiter mitarbeiter : mitarbeiters) {
			mitarbeiter.accept(visitor);
		}
		visitor.finish(); // Neu: finish Methode für Operationen nach der Iteration
	}

}
