package singleTonDesignPattern;

public class DriverClass {
	public static void main(String[] args) {
		DatabaseSingletonDesign databaseObj = DatabaseSingletonDesign.getDatabaseConnection();
		System.out.println(databaseObj);
	}
}
