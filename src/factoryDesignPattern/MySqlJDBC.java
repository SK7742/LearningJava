package factoryDesignPattern;

import java.util.HashMap;

public class MySqlJDBC implements DatabaseConnection{

	private String JdbcDriver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/schema";
	private String username = "mySqlUserAdmin";
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
