package de.composite.visitors;

import de.composite.Leaf;
import de.composite.Node;

public interface KontoVisitor {
	
	void init();
	void close();
	void visit(Node node);
	
	void visit(Leaf leaf);
}
