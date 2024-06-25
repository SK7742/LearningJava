package factoryDesignPattern;

import java.util.HashMap;

public class OracleJBDBC implements DatabaseConnection{

	private String JdbcDriver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe\",\"system\",\"oracle";
	private String username = "oracleUserAdmin";
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
