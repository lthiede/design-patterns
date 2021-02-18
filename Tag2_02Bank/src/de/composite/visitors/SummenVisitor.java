package de.composite.visitors;

import de.composite.Konto;

public class SummenVisitor extends AbstractKontenVisitor {
	
	private double summe  = 0.0;
	
	@Override
	public void visit(Konto konto) {
		summe += konto.getSalso();
	}

	public double getSumme() {
		return summe;
	}
	
	@Override
	public void init() {
		summe = 0;
	}
	@Override
	public void close() {
		System.out.println(summe);
	}
}
