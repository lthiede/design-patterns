package de.firma;

import java.util.ArrayList;
import java.util.List;

import de.listeners.EmployeeNumberChangedListener;
import de.mitarbeiter.AbstractMitarbeiter;
import de.mitarbeiter.vistors.MitarbeiterVisitor;

public class Firma {

	// Keep a list of listeners listening for changes of the number of employees
	private List<EmployeeNumberChangedListener> listeners = new ArrayList<>();

	// Add a listener to the list
	public boolean addEmployeeNumberChangedListener(EmployeeNumberChangedListener employeeNumberChangedListener) {
		return listeners.add(employeeNumberChangedListener);
	}

	// Remove a listener from the list
	public boolean removeEmployeeNumberChangedListener(EmployeeNumberChangedListener employeeNumberChangedListener) {
		return listeners.remove(employeeNumberChangedListener);
	}

	// Fire an event for a changed number of employees parameterized by the number of added employees
	private void fireEmployeeNumberChangedEvent(int change) {
		// Create an event object with the specified number of new employees
		EmployeeNumberChangedEvent employeeNumberChangedEvent = new EmployeeNumberChangedEvent(this, change);
		for (EmployeeNumberChangedListener listener : listeners) {
			// Call method of every listener
			listener.employeeNumberChanged(employeeNumberChangedEvent);
		}
	}

	private List<AbstractMitarbeiter> mitarbeiters = new ArrayList<>();

	public boolean add(AbstractMitarbeiter mitarbeiter) {
		// fire an event signifying one added employee
		fireEmployeeNumberChangedEvent(1);
		return mitarbeiters.add(mitarbeiter);
	}

	public boolean remove(AbstractMitarbeiter mitarbeiter) {
		/*
		 Fire an event signifying one removed employee
		 This is equivalent to negative one removed employees
		 */
        fireEmployeeNumberChangedEvent(-1);
		return mitarbeiters.remove(mitarbeiter);
	}
	
//	public void print() {
//		for (AbstractMitarbeiter mitarbeiter : mitarbeiters) {
//			System.out.println(mitarbeiter);
//		}
//	}
	
	public void iterate(MitarbeiterVisitor visitor) {
		for (AbstractMitarbeiter mitarbeiter : mitarbeiters) {
			mitarbeiter.accept(visitor);
		}
	}

}
