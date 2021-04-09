package de.listeners;

import de.firma.EmployeeNumberChangedEvent;

public class ChangeListener {

    private int employeeNumber;

    public ChangeListener() {
        this.employeeNumber = 0;
    }

    public void updateEmployeeNumber(EmployeeNumberChangedEvent employeeNumberChangedEvent) {
        setEmployeeNumber(getEmployeeNumber() + employeeNumberChangedEvent.getChange());
        System.out.println(new StringBuilder().append("current Number of Employees: ").append(getEmployeeNumber()).toString());
    }

    private void setEmployeeNumber(int n) {
        this.employeeNumber = n;
    }

    private int getEmployeeNumber() {
        return this.employeeNumber;
    }
}
