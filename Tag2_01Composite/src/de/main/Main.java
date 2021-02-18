package de.main;

import de.composite.AbstractNode;
import de.composite.Leaf;
import de.composite.Node;

public class Main {

	public static void main(String[] args) {
		
		Node root = new Node("Root");
		
		Node e1_1 = new Node("E1 1");
		root.append(e1_1);
		
		Node e1_2 = new Node("E1 2");
		root.append(e1_2);
		
		
		Node e2_1_1 = new Node("E2_1_1");
		e1_1.append(e2_1_1);

		Leaf e2_1_2 = new Leaf("E2_1_2");
		e1_1.append(e2_1_2);

		Node e2_2_1 = new Node("E2_2_1");
		e1_2.append(e2_2_1);

		Leaf e2_2_2 = new Leaf("E2_2_2");
		e1_2.append(e2_2_2);
		
		travers(root);

	}
	
	// ‹ber den Baum traversieren heiﬂt den Baum rekursiv abarbeiten
	public static void travers(AbstractNode node) {
		System.out.println(node);
		for(AbstractNode child: node.getChildren()) {
			travers(child);
		}
	}

}
