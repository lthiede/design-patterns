package de.files;

public abstract class AbstractCounter implements CharacterHandler {
	
	protected int counter;

	@Override
	public void init() {
		counter = 0;

	}

	

	@Override
	public void dispose() {
		System.out.println(this.getClass().getName() + " Anzahl = " + counter);

	}

}
