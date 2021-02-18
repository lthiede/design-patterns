package de.main;

import java.util.Iterator;
import java.util.List;

import de.composite.AbstractBankNode;
import de.composite.Konto;
import de.composite.KontoGruppe;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		KontoGruppe root = new KontoGruppe("Root");
		
		KontoGruppe e1_1 = new KontoGruppe("E1 1");
		root.append(e1_1);
		
		KontoGruppe e1_2 = new KontoGruppe("E1 2");
		root.append(e1_2);
		
		
		KontoGruppe e2_1_1 = new KontoGruppe("E2_1_1");
		e1_1.append(e2_1_1);

		Konto e2_1_2 = new Konto("E2_1_2");
		e1_1.append(e2_1_2);

		KontoGruppe e2_2_1 = new KontoGruppe("E2_2_1");
		e1_2.append(e2_2_1);

		Konto e2_2_2 = new Konto("E2_2_2");
		e1_2.append(e2_2_2);
		
		

	}
	
	

}
