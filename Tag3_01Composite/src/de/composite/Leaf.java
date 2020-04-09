package de.composite;

import de.composite.visitors.KontoVisitor;

public class Leaf extends AbstractNode {

	public Leaf(String label) {
		super(label);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Leaf [getLabel()=");
		builder.append(getLabel());
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public void accept(KontoVisitor visitor) {
		visitor.visit(this);
		
	}

}
