package de.main;

import de.composite.AbstractNode;
import de.composite.Leaf;
import de.composite.Node;

public class Main {

	public static void main(String[] args) {
		
		Node root = new Node("root");
		
		Node e1_1 = new Node("E1_1");
		root.addChild(e1_1);
		
		Node e1_2 = new Node("E1_2");
		root.addChild(e1_2);
		
		
		Node e2_1 = new Node("E2_1");
		e1_1.addChild(e2_1);
		

		Leaf e2_2 = new Leaf("E2_2");
		e1_1.addChild(e2_2);
		

		Node e2_3 = new Node("E2_3");
		e1_2.addChild(e2_3);
		

		Leaf e2_4 = new Leaf("E2_4");
		e1_2.addChild(e2_4);
		
		travers(root);

	}
	
	public static void travers(AbstractNode node) {
		System.out.println(node);
		for (AbstractNode child : node.getChildren()) {
			travers(child);
		}
	}

}
