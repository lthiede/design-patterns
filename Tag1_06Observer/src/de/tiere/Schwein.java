package de.tiere;

import java.util.ArrayList;
import java.util.List;

public class Schwein {
	
	private List<PigTooFatListener> listeners = new ArrayList<>();
	
	
	
	public boolean addPigTooFatListener(PigTooFatListener pigTooFatListener) {
		return listeners.add(pigTooFatListener);
	}

	public boolean removePigTooFatListener(PigTooFatListener pigTooFatListener) {
		return listeners.remove(pigTooFatListener);
	}
	
	private void firePigTooFatEvent() {
		for (PigTooFatListener listener : listeners) {
			listener.pigTooFat(this);
		}
	}
	

	private String name;
	private int gewicht;
	
	public Schwein() {
		this("Nobody");
	}
	
	public Schwein(String name) {
		this.gewicht =10;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGewicht() {
		return gewicht;
	}

	private void setGewicht(int gewicht) {
		this.gewicht = gewicht;
		if(gewicht > 20)
			firePigTooFatEvent();
	}
	
	public void fressen() {
		setGewicht(getGewicht() + 1); 
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Schwein [name=");
		builder.append(name);
		builder.append(", gewicht=");
		builder.append(gewicht);
		builder.append("]");
		return builder.toString();
	}
	
	

}
