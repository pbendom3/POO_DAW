package chalet;

import java.util.ArrayList;

public class Casa {

    private String direccion;
    private ArrayList<Habitacion> listaHabitaciones;

    public Casa (String direccion){
        this.direccion=direccion;
        listaHabitaciones = new ArrayList<>();
    }

    public void crearHabitacion (String nombre, double metros){

        for(Habitacion habitacion : listaHabitaciones){
            if (habitacion.getNombre().equals(nombre)){
                System.out.println("La habitación " + nombre + " ya existe.");
                return;
            }
        }

        Habitacion habitacion = new Habitacion(nombre,metros);
        listaHabitaciones.add(habitacion);

    }

    public void borrarHabitacion(){

    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public void mostrarHabitaciones (){

        System.out.println("Hay " + listaHabitaciones.size() + " habitaciones de la casa en la dirección " + direccion);

        for (Habitacion habitacion : listaHabitaciones){
            System.out.println("- " + habitacion.getNombre() + " con " + habitacion.getMetros() + "m2");
        }

    }

    public Habitacion getHabitacionMasGrande(){
        Habitacion maximo = listaHabitaciones.get(0);

        for (Habitacion habitacion : listaHabitaciones){
            if (maximo.getMetros()<habitacion.getMetros()){
                maximo=habitacion;
            }
        }

        return maximo;

    }

    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                '}';
    }




}
