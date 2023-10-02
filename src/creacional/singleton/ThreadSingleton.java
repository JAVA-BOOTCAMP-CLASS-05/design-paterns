package creacional.singleton;

public class ThreadSingleton {
	
	private static ThreadSingleton instance = null;
	
	private String value;
	
	private ThreadSingleton(String v) {
        /**
         * Relentizamos la creacion para poder observar el ejemplo
         */
		try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
		this.setValue(v); 
	}

	public static ThreadSingleton getInstance(String v) {
		if (instance == null) {
			instance = new ThreadSingleton(v);
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

