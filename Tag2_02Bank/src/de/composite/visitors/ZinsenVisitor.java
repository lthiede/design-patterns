package de.composite.visitors;

import de.composite.Konto;

public class ZinsenVisitor  extends AbstractKontenVisitor{
	
	private final double zinsSatz;
	
	

	public ZinsenVisitor(double zinsSatz) {
		this.zinsSatz = zinsSatz;
	}



	@Override
	public void visit(Konto konto) {
		konto.setSalso(konto.getSalso() * zinsSatz);
	}
	
	

}
