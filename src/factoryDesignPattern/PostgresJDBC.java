package factoryDesignPattern;

import java.util.HashMap;

public class PostgresJDBC implements DatabaseConnection{

	private String JdbcDriver = "org.postgresql.Driver";
	private String url = "jdbc:postgresql://localhost:5432/schema";
	private String username = "postgresUserAdmin";
	private String password = "p@ssw0rd";
	
	@Override
	public HashMap<String, String> connection() {
		HashMap<String, String> dbProperties = new HashMap<>();
		dbProperties.put("JdbcDriver", JdbcDriver);
		dbProperties.put("url", url);
		dbProperties.put("username", username);
		dbProperties.put("password", password);
		return dbProperties;
	}
}
