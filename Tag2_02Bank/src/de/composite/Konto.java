package de.composite;

public class Konto extends AbstractBankNode {

	private double salso = 0;
	
	public Konto(String label) {
		super(label);
		
	}

	public double getSalso() {
		return salso;
	}

	public void setSalso(double salso) {
		this.salso = salso;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Konto [salso=");
		builder.append(salso);
		builder.append(", Label=");
		builder.append(getLabel());
		builder.append("]");
		return builder.toString();
	}
	

	
}
