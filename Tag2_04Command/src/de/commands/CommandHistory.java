package de.commands;

public class CommandHistory {
	
	public void addCommand(Command command) {
		if(command.isQuery()) return;
		
		// Action wenn Transaktion....
	}
	
	public void undo() {
		System.out.println("can't undo");
	}
	
	public void redo() {
		System.out.println("can't redo");
	}
	
	

}
