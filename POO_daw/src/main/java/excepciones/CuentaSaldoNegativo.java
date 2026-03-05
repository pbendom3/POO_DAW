package excepciones;

public class CuentaSaldoNegativo extends RuntimeException {
    public CuentaSaldoNegativo() {
        super("El saldo tiene que ser positivo");
    }
}
