package factoryDesignPattern;

import java.util.HashMap;

public interface DatabaseConnection {
	public HashMap<String, String> connection();
}
