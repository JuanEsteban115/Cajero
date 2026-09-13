package exceptions;

public class RetiroNegativo extends Exception {
    public RetiroNegativo(String message) {
        super("Error, no puede ingresar numeros negativos");
    }
}
