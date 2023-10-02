package creacional.abstractFactory;

public class ClientDemo {

	 private static Application configureApplication() {
        Factory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowFactory();
        }

        return new Application(factory);
    }	

	 public static void main(String[] args) {
		 
		 Application app = configureApplication();
		 
		 app.paint();
	}

}
