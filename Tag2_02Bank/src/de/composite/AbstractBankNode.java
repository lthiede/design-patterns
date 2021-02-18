package de.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import de.composite.visitors.KontenVisitor;

public abstract class AbstractBankNode {
	
	private AbstractBankNode parent = null;
	private String label;

	public AbstractBankNode( String label) {
		this.label = label;
	}

	public AbstractBankNode getParent() {
		return parent;
	}

	public void setParent(AbstractBankNode parent) {
		this.parent = parent;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AbstractNode [label=");
		builder.append(label);
		builder.append("]");
		return builder.toString();
	}
	
	public List<AbstractBankNode> getChildren() {
		return Collections.emptyList();
	}

//	public void print() {
////		System.out.println(this);
////		for (AbstractBankNode child : getChildren()) {
////			child.print();
////		}
//		
////		for(Iterator<AbstractBankNode> it = iterator(); it.hasNext();) {
////			System.out.println(it.next());
////		}
//		
//		iterator().forEachRemaining(System.out::println);
//	}
	
	public Iterator<AbstractBankNode> iterator() {
		// Liste verwenden um keinen eigenen Iterator programmieren zu müssen
		List<AbstractBankNode> liste = new ArrayList<>();
		
		// Liste mit sich selbst und allen Kindern und Kindeskindern füllen
		iteratorHelper(liste);
		
		// einfach Iterator der Liste als eigenen verkaufen
		return liste.iterator();
				
	}
	
	// Ist nur dazu da um das Casten der Zeiger zu vermeiden
	public abstract void accept(KontenVisitor visitor);
	
	
	public void iterate(KontenVisitor visitor) {
		
		visitor.init();
		
		Iterator<AbstractBankNode> it = iterator();
		while(it.hasNext()) {
			it.next().accept(visitor);
		}
		
		visitor.close();
	}
	
	
	private void iteratorHelper(List<AbstractBankNode> list) {
		// Liste mit sich selbst und allen Kindern und Kindeskindern füllen
		list.add(this);
		for(AbstractBankNode child: getChildren()) {
			child.iteratorHelper(list);
		}
	}
}
