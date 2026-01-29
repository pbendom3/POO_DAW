package chalet;

public class Habitacion {

    private double metros;
    private String nombre;

    public Habitacion (String nombre, double metros){
        this.nombre=nombre;
        this.metros=metros;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    @Override
    public String toString() {
        return "Habitacion{" +
                "nombre='" + nombre + '\'' +
                ", metros=" + metros +
                '}';
    }

}
