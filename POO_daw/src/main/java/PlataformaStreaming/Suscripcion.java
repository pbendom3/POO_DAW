package PlataformaStreaming;

public abstract class Suscripcion {
    private String nombrePlan;
    private double precio;

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Suscripcion(String nombrePlan, double precio) {
        this.nombrePlan = nombrePlan;
        this.precio = precio;
    }

    public void mostrarInfo(String nombrePlan, double precio){
        System.out.println("Plan: " + nombrePlan + ", Precio: " + precio + "€");
    }

    public abstract void obtenerBeneficios();

    public abstract void obtenerPeriodoPrueba();
}
