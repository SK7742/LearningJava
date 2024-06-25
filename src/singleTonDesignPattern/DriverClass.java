package singleTonDesignPattern;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

public class DriverClass {
	public static void main(String[] args) throws SQLException {
		DatabaseSingletonDesign databaseObj = DatabaseSingletonDesign.getDatabaseConnection();
		Connection connection = databaseObj.getMySqlJdbcConnection();
		try {
			connection.beginRequest();
			PreparedStatement statement = connection.prepareStatement("insert into student values (?, ?, ?, ?, ?, ?, ?)");
			statement.setInt(1, UUID.randomUUID().hashCode());
			statement.setString(2, "Test Name One");
			statement.setDate(3, new Date(1998, 10, 15));
			statement.setString(4, "O+");
			statement.setString(5, "Test Father's Name One");
			statement.setString(6, "Test Mother's Name One");
			statement.setLong(7, 91876543210L);
			statement.executeUpdate();
			
			PreparedStatement statementTwo = connection.prepareStatement("insert into student values (?, ?, ?, ?, ?, ?, ?)");
			statementTwo.setInt(1, UUID.randomUUID().hashCode());
			statementTwo.setString(2, "Test Name Two");
			statementTwo.setDate(3, new Date(2000, 9, 15));
			statementTwo.setString(4, "O-");
			statementTwo.setString(5, "Test Father's Name Two");
			statementTwo.setString(6, "Test Mother's Name Two");
			statementTwo.setLong(7, 8967453210L);
			statementTwo.executeUpdate();
			connection.commit();
			System.out.println("Data inserted...");
		}catch(Exception e) {
			connection.rollback();
			System.out.println("Txn rollback...");
			System.out.println(e.getMessage());
		}
	}
}
