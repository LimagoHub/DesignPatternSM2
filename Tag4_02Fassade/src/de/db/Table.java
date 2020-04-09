package de.db;

public class Table implements AutoCloseable{
	
	private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/sm2?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Berlin";
	
	
	public Table(String selectString) {
		
	}

	
	public int getColumnCount () throws Exception {
		return -1;
	}
	
	public String getColumnName(int column) throws Exception {
		return null;
	}
	
	public String getValue(int column) throws Exception {
		return null;
	}
	
	public String getValue(String columnName) throws Exception {
		return null;
	}
	
	public boolean next() throws Exception {
		return false;
	}


	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
