package de.composite.visitors;

import de.composite.Leaf;
import de.composite.Node;

public class PrintVisitor extends AbstractKontenVisitor {

	@Override
	public void visit(Node node) {
		System.out.println(node);
	}

	@Override
	public void visit(Leaf leaf) {
		System.out.println(leaf);
	}

	
	
}
