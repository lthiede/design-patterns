package de.listeners;

import de.firma.EmployeeNumberChangedEvent;

/*
 This interface is a functional Interface
 It has only one method and specifies the method's parameters' and return's types
 */
public interface EmployeeNumberChangedListener {

    void employeeNumberChanged(EmployeeNumberChangedEvent employeeNumberChangedEvent);

}
