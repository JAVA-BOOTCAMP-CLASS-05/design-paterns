package creacional.singleton;

public class SimpleSingleton {
	
	private static SimpleSingleton instance = null;
	
	private String value;
	
	private SimpleSingleton() {}

	public static SimpleSingleton getInstance() {
		if (instance == null) {
			instance = new SimpleSingleton();
		}
		
		return instance;
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}

