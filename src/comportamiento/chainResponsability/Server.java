package comportamiento.chainResponsability;

import java.util.HashMap;
import java.util.Map;

public class Server {
    private final Map<String, String> users = new HashMap<>();
    private Validador validador;

    public void setValidador(Validador validador) {
        this.validador = validador;
    }

    /**
     * Server gets email and password from client and sends the authorization
     * request to the chain.
     */
    public boolean logIn(String email, String password) throws Exception {
        if (validador.validar(email, password)) {
            System.out.println("Autorizacion SUCESS!");

             return true;
        }
        return false;
    }

    public void registrar(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}
