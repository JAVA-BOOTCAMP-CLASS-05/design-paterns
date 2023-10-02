package creacional.singleton;

public class ThreadSingletonSynchronized {
	
	private static ThreadSingletonSynchronized instance = null;
	
	private String value;
	
	private ThreadSingletonSynchronized(String v) {
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

	public static ThreadSingletonSynchronized getInstance(String v) {
		synchronized (ThreadSingletonSynchronized.class) {
			if (instance == null) {
				instance = new ThreadSingletonSynchronized(v);
			}
			
			return instance;
		}
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}

