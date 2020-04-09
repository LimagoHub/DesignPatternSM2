package de.db;

public class Main {

	public static void main(String[] args) {

		try(Table table = new Table("select * from tblPersonen")) {
			
			for(int column = 0; column < table.getColumnCount(); column++) {
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
