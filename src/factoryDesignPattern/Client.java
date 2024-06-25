package factoryDesignPattern;

public class Client {
	public static void main(String[] args) {
		System.out.println("Hey, I am client and I want to get the database property based on the connection I pass.");
		System.out.println("Trying for mysql database");
		DatabaseConnection mySqlConnection = JDBCFactory.getConnectionForDB("mysql");
		System.out.println("Iteratating properties");
		mySqlConnection.connection().keySet().forEach(key->System.out.println(key + ": " + mySqlConnection.connection().get(key)));
		System.out.println("**************************************");
		
		System.out.println("Trying for postgres database");
		DatabaseConnection postgresConnection = JDBCFactory.getConnectionForDB("postgres");
		System.out.println("Iteratating properties");
		postgresConnection.connection().keySet().forEach(key->System.out.println(key + ": " + postgresConnection.connection().get(key)));
		System.out.println("**************************************");
		
		System.out.println("Trying for postgres database");
		DatabaseConnection oracleConnection = JDBCFactory.getConnectionForDB("oracle");
		System.out.println("Iteratating properties");
		oracleConnection.connection().keySet().forEach(key->System.out.println(key + ": " + oracleConnection.connection().get(key)));
		System.out.println("**************************************");
		
		System.out.println("Trying for invalid database");
		DatabaseConnection testConnection = JDBCFactory.getConnectionForDB("mongo");
		System.out.println("Iteratating properties");
		testConnection.connection().keySet().forEach(key->System.out.println(key + ": " + testConnection.connection().get(key)));
		System.out.println("**************************************");
	} 
}
