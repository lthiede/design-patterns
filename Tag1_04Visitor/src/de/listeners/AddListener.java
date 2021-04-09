package de.listeners;

import de.firma.EmployeeNumberChangedEvent;
import de.firma.Firma;

public class AddListener {

    public void greetAddedEmployee(EmployeeNumberChangedEvent employeeNumberChangedEvent) {
        if(employeeNumberChangedEvent.getChange() == 1) {
            System.out.println("welcome to our company");
        }
    }

}
