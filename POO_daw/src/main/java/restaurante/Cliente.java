package restaurante;

public class Cliente extends Persona{
    private Integer mesa;
    private int numeroComensales;

    public Cliente(String nombre, String dni, Integer mesa, int numeroComensales) {
        super(nombre, dni);
        this.mesa = mesa;
        this.numeroComensales = numeroComensales;
    }

    public Integer getMesa() {
        return mesa;
    }

    public void setMesa(Integer mesa) {
        this.mesa = mesa;
    }

    public int getNumeroComensales() {
        return numeroComensales;
    }

    public void setNumeroComensales(int numeroComensales) {
        this.numeroComensales = numeroComensales;
    }

    @Override
    public void mostrarInfoPersona(){
        super.mostrarInfoPersona();
        System.out.println("Mesa " + mesa + " y se sientan " + numeroComensales);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "mesa=" + mesa +
                ", numeroComensales=" + numeroComensales +
                '}';
    }
}
