package de.composite.visitors;

import de.composite.Konto;
import de.composite.KontoGruppe;

public abstract class AbstractKontenVisitor implements KontenVisitor {

	@Override
	public void visit(Konto konto) {
		// Ok
		
	}

	@Override
	public void visit(KontoGruppe kontoGruppe) {
		// Ok
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	
	

}
