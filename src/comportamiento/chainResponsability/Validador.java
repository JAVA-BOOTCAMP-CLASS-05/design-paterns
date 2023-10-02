package comportamiento.chainResponsability;

public abstract class Validador {
    private Validador siguiente;

    /**
     * Encadena otro Mediador
     */
    public Validador linkWith(Validador siguiente) {
        this.siguiente = siguiente;
        return siguiente;
    }

    /**
     * Cada subclase deber� implementar su forma de validar.
     */
    public abstract boolean validar(String email, String password) throws Exception;

    /**
     * Si existe mediador encadenado le pasamos la tarea de validar.
     */
    protected boolean validarSiguiente(String email, String password) throws Exception {
        if (siguiente == null) {
            return true;
        }
        return siguiente.validar(email, password);
    }
}
