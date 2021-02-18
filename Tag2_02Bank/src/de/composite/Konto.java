package de.composite;

import de.composite.visitors.KontenVisitor;

public class Konto extends AbstractBankNode {

	private double salso = 1000;
	
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
	
	public void accept(KontenVisitor visitor) {
		// Der Trick ist, dass die this-Referenz vom ricjtigen Typ ist (Hier Konto)
		visitor.visit(this);
	}
	
}
