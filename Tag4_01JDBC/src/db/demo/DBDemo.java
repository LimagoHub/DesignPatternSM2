package db.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;



public class DBDemo {
	
	private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/sm2?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Berlin";
	
	public static void main(String[] args) throws Exception{
		
		//Class.forName("driver")
		try (Connection connection = DriverManager.getConnection(CONNECTION_STRING,"root","yop49JZ")) {
			try (Statement statement = connection.createStatement()){
				//statement.execute("Create Table tblTest (id int primary key auto_increment not null, text varchar(20) not null)");
				
				try (ResultSet resultSet = statement.executeQuery("SELECT * FROM tblPersonen")) {
					ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
					
					for(int column = 1; column <= resultSetMetaData.getColumnCount(); column++) {
						System.out.printf("%-20s", resultSetMetaData.getColumnName(column));
					}
					System.out.println();
					
					
					while(resultSet.next()) {
						for(int column = 1; column <= resultSetMetaData.getColumnCount(); column++) {
							System.out.printf("%-20s", resultSet.getString(column));
							
						}
						System.out.println();
					}
				}
								
			}
		}
	}

}
