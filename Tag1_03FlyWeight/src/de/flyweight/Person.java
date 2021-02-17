package de.flyweight;

public class Person {
	
	private String vorname, nachname;

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
