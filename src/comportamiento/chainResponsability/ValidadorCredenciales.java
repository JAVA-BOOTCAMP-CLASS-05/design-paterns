package comportamiento.chainResponsability;

public class ValidadorCredenciales extends Validador {
    private final Server server;

    public ValidadorCredenciales(Server server) {
        this.server = server;
    }

    @Override
    public boolean validar(String email, String password) throws Exception {
        if (!server.hasEmail(email)) {
            System.out.println("Esta direccion de email NO esta registrada!!!");
            return false;
        }
        
        if (!server.isValidPassword(email, password)) {
            System.out.println("Password incorrecto!");
            return false;
        }
        
        return validarSiguiente(email, password);
    }


}
