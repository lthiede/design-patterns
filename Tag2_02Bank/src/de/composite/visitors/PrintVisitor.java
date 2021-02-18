package de.composite.visitors;

import de.composite.AbstractBankNode;
import de.composite.Konto;
import de.composite.KontoGruppe;

public class PrintVisitor extends AbstractKontenVisitor {

	@Override
	public void visit(Konto konto) {
		print(konto);

	}

	@Override
	public void visit(KontoGruppe kontoGruppe) {
		print(kontoGruppe);

	}

	private void print(AbstractBankNode node) {
		System.out.println(node);
		
	}
	
	

}
