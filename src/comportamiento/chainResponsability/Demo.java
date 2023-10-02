package comportamiento.chainResponsability;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.registrar("admin@example.com", "admin_pass");
        server.registrar("user@example.com", "user_pass");

        Validador validador = new ValidadorCantidadDeFallas(2);
        validador.linkWith(new ValidadorCredenciales(server))
                 .linkWith(new ValidadorRoles());

        server.setValidador(validador);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success = Boolean.FALSE;
        do {
            System.out.print("Ingrese email: ");
            String email = reader.readLine();
            System.out.print("Ingrese password: ");
            String password = reader.readLine();
            try {
				success = server.logIn(email, password);
			} catch (Exception e) {
				e.printStackTrace();
			}
        } while (!success);
    }

}
