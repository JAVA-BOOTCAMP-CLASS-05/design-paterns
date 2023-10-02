package comportamiento.chainResponsability;

public class ValidadorRoles extends Validador {

	@Override
    public boolean validar(String email, String password) throws Exception {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, ADMIN!");
            return true;
        }
        
        System.out.println("Hello, USER!");
        return validarSiguiente(email, password);
    }


}
