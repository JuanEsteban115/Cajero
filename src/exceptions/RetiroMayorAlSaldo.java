package exceptions;

public class RetiroMayorAlSaldo extends Exception {
    public RetiroMayorAlSaldo(String message) {
        super("Error, el retiro excede al saldo disponible");
    }
}
