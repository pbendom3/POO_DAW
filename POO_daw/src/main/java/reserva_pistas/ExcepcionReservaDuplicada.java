package reserva_pistas;

public class ExcepcionReservaDuplicada extends RuntimeException {
    public ExcepcionReservaDuplicada() {
        super("Esta reserva ya esta cogida");
    }
}
