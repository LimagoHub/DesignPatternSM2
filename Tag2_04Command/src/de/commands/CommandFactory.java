package de.commands;

public class CommandFactory {
	
	public static Command createCommand(String zeile) {
		String [] tokens = zeile.split(" ");
		
		Command retval = null;
		
		if(tokens[0].equals("Add")) {
			retval = new AddCommand();
			retval.parse(tokens);
		} else if (tokens[0].equals("Print")) {
			retval = new PrintCommand();
			retval.parse(tokens);
		}
		
		return retval;
	}

}
