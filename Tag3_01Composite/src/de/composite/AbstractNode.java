package de.composite;

import java.util.Collections;
import java.util.List;

public abstract class AbstractNode {
	
	private String label;
	private AbstractNode parent = null;
	
	public AbstractNode(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public AbstractNode getParent() {
		return parent;
	}

	public void setParent(AbstractNode parent) {
		this.parent = parent;
	}
	
	public List<AbstractNode> getChildren() {
		return Collections.emptyList();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AbstractNode [label=");
		builder.append(label);
		builder.append("]");
		return builder.toString();
	}
	
	

}
