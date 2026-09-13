package exceptions;

public class ValorNegativoParaRecargar extends Exception {
    public ValorNegativoParaRecargar(String message) {
        super("Error, no puede recargar cifras negativas");
    }
}
