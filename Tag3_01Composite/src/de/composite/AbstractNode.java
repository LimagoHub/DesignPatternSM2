package de.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import de.composite.visitors.KontoVisitor;

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
	
	public Iterator<AbstractNode> iterator() {
		List<AbstractNode> list = new ArrayList<>();
		iteratorImpl(list);
		return list.iterator();
	}

	private void iteratorImpl(List<AbstractNode> list) {
		list.add(this);
		getChildren().forEach(c->c.iteratorImpl(list));
		
	}
	
	public abstract void accept(KontoVisitor visitor); 
	
	public void iterate(KontoVisitor visitor) {
		visitor.init();
		iterator().forEachRemaining(k->k.accept(visitor));
		visitor.close();
		
	}

}
