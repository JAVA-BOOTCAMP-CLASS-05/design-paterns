package comportamiento.chainResponsability;

public class ValidadorCantidadDeFallas extends Validador {
    private final int requestPerMinute;
    private int request;
    private long currentTime;

    public ValidadorCantidadDeFallas(int requestPerMinute) {
    	this.requestPerMinute = requestPerMinute;
    	this.currentTime = System.currentTimeMillis();
    }
 
    @Override
    public boolean validar(String email, String password) throws Exception {
        if (System.currentTimeMillis() > currentTime + 60000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }

        request++;
        
        if (request > requestPerMinute) {
            System.out.println("Request limit exceeded!");
            throw new Exception("Request limit exceeded");
        }
        
        return validarSiguiente(email, password);    	
    }

}
