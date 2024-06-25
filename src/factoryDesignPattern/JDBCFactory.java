package factoryDesignPattern;

import com.mysql.jdbc.StringUtils;

public class JDBCFactory {
	public static DatabaseConnection getConnectionForDB(String databaseName) {
		if(!StringUtils.isNullOrEmpty(databaseName)) {
			switch (databaseName) {
			case "mysql" : return new MySqlJDBC();
			case "oracle" : return new OracleJBDBC();
			case "postgres" : return new PostgresJDBC();
			default: System.out.println("Factory is unable to create a object type " + databaseName);
			}
		}
		System.out.println("provide a valid database name");
		return null;
	}
}
