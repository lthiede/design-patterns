package de.beans;

import java.util.ArrayList;
import java.util.List;

import de.events.PropertyChangedEvent;
import de.events.PropertyChangedListener;

public class Person {
	
	private List<PropertyChangedListener> propertyChangedListeners = new ArrayList<>();
	
	public void addPropertyChangedListener(PropertyChangedListener propertyChangedListener) {
		propertyChangedListeners.add(propertyChangedListener);
	}
	
	public void removePropertyChangedListener(PropertyChangedListener propertyChangedListener) {
		propertyChangedListeners.remove(propertyChangedListener);
	}
	
	private void firePropertyChangedEvent(PropertyChangedEvent event) {
		for (PropertyChangedListener listener : propertyChangedListeners) {
			listener.propertyChanged(event);
		}
	}
	
	private void firePropertyChangedEvent(String propertyName, Object oldValue, Object newValue) {
		firePropertyChangedEvent(new PropertyChangedEvent(this, propertyName, oldValue, newValue));
	}
	
	private String vorname, nachname;

	
	public Person() {
		this("John","Doe");
	}
	
	public Person(String vorname, String nachname) {
		
		this.vorname = vorname;
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		PropertyChangedEvent event = new PropertyChangedEvent(this, "vorname", this.vorname, vorname);
		this.vorname = vorname;
		firePropertyChangedEvent(event);
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		firePropertyChangedEvent("nachname", this.nachname, this.nachname = nachname);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [vorname=");
		builder.append(vorname);
		builder.append(", nachname=");
		builder.append(nachname);
		builder.append("]");
		return builder.toString();
	}
	
	

}
