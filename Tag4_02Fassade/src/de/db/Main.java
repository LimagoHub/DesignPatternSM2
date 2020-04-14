package de.db;

public class Main {

	public static void main(String[] args) {

		try(Table table = new Table("select * from tblPersonen")) {
			
			for(int column = 0; column < table.getColumnCount(); column++) {
				System.out.printf("%-20s",table.getColumnName(column));
			}
			System.out.println();
			
			while(table.next()) {
				for(int column = 0; column < table.getColumnCount(); column++) {
					System.out.printf("%-20s",table.getValue(column));
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
