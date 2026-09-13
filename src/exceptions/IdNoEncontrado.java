package exceptions;

public class IdNoEncontrado extends Exception {
    public IdNoEncontrado(String message) {
        super("Error, id no encontrado");
    }
}
