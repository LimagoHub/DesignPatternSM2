package de.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class Table implements AutoCloseable {

	private static final String CONNECTION_STRING = "jdbc:mysql://perseus:3306/sm2?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Berlin";
	private static final String dbUser = "root";
	private static final String dbPassword = "route66";
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	private ResultSetMetaData resultSetMetaData = null;
	private Map<String, String> zeile = null;
	private int columnCount = -1;
	private final String selectString;

	public Table(String selectString) {
		this.selectString = selectString;
	}

	public int getColumnCount() throws Exception {
		if(columnCount == -1) {
			columnCount = getResultSetMetaData().getColumnCount();
		}
		return columnCount;
	}

	public String getColumnName(int column) throws Exception {
		return getResultSetMetaData().getColumnName(column+1);
	}

	public String getValue(int column) throws Exception {
		return getValue(getColumnName(column));
	}

	public String getValue(String columnName) throws Exception {
		return getZeile().get(columnName);
	}

	public boolean next() throws Exception {
		if(getResultSet().next()) {
			dataExchange();
			return true;
		}
		return false;
	}

	private void dataExchange() throws Exception {
		for(int column = 0; column < getColumnCount(); column++) {
			getZeile().put(getColumnName(column),getResultSet().getString(getColumnName(column)));
		}
	}
	
	private Connection getConnection() throws Exception {
		if (connection == null) {
			connection = DriverManager.getConnection(CONNECTION_STRING, dbUser, dbPassword);
		}
		return connection;
	}

	private Statement getStatement() throws Exception {
		if (statement == null) {
			statement = getConnection().createStatement();
		}
		return statement;
	}

	private ResultSet getResultSet() throws Exception {
		if(resultSet == null ) {
			resultSet = getStatement().executeQuery(selectString);
		}
		return resultSet;
	}

	private ResultSetMetaData getResultSetMetaData() throws Exception {
		if(resultSetMetaData == null) {
			resultSetMetaData = getResultSet().getMetaData();
		}
		return resultSetMetaData;
	}

	private Map<String, String> getZeile() throws Exception {
		if(zeile == null) {
			zeile = new HashMap<>();
			for(int column=0;column<getColumnCount();column++) {
				zeile.put(getColumnName(column), ""); 
			}
		}
		return zeile;
	}

	@Override
	public void close() throws Exception {
		if(resultSet != null) {
			resultSet.close();
		}

		if(statement != null) {
			statement.close();
		}
		
		if(connection != null) {
			connection.close();
		}
	}
}
