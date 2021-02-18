package de.main;

import de.composite.Konto;
import de.composite.KontoGruppe;
import de.composite.visitors.PrintVisitor;
import de.composite.visitors.SummenVisitor;
import de.composite.visitors.ZinsenVisitor;

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
		
		Konto e2_2_3 = new Konto("E2_2_3");
		e1_2.append(e2_2_3);
		
		Konto e2_2_4 = new Konto("E2_2_4");
		e1_2.append(e2_2_4);
		
		root.iterate(new PrintVisitor());
		root.iterate(new ZinsenVisitor(1.02));
		root.iterate(new PrintVisitor());
		
		
		root.iterate( new SummenVisitor());
		
		

	}
	
	

}
