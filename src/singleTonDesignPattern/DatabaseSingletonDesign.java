package singleTonDesignPattern;

import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseSingletonDesign {
	public Connection mySqlJdbcConnection;
	public static DatabaseSingletonDesign databaseSingletonDesign;
	
	private DatabaseSingletonDesign() {}
	public Connection getMySqlJdbcConnection() {
		return mySqlJdbcConnection;
	}
	
	public static DatabaseSingletonDesign getDatabaseConnection() {
		if(databaseSingletonDesign == null) {
			databaseSingletonDesign = new DatabaseSingletonDesign();
			establishConnectionWithDataBase(databaseSingletonDesign);
		}
		return databaseSingletonDesign;
	}

	private static void establishConnectionWithDataBase(DatabaseSingletonDesign databaseSingletonDesign) {
		if(databaseSingletonDesign.mySqlJdbcConnection == null) {
			try {
	            // Load the MySQL JDBC driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Establish a connection to the database
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolreaderschema", "root", "root");
	            con.setAutoCommit(false);
	            databaseSingletonDesign.mySqlJdbcConnection = con;
	            System.out.println("Connection Established...");
			}catch(Exception e) {
				System.out.println("Exception caught: \n" + e.getMessage());
			}
		}
		
	}
}