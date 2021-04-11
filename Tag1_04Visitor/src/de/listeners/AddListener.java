package de.listeners;

import de.firma.EmployeeNumberChangedEvent;

public class AddListener {

    // Greet the new employee when an event signifying a new employee is received
    public void greetAddedEmployee(EmployeeNumberChangedEvent employeeNumberChangedEvent) {
        // check if an employee was added (not removed)
        if(employeeNumberChangedEvent.getChange() == 1) {
            System.out.println("welcome to our company");
        }
    }

}
