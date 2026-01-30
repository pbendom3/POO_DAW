package chalet;

import java.util.ArrayList;
import java.util.Scanner;

public class Casa {

    static Scanner teclado = new Scanner(System.in);

    private String direccion;
    private ArrayList<Habitacion> listaHabitaciones;
    private Propietario propietario;

    public Casa (String direccion){
        this.direccion=direccion;
        listaHabitaciones = new ArrayList<>();
        setPropietario();
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

    public void borrarHabitacion(String nombre){

        for (Habitacion habitacion : listaHabitaciones){
            if (habitacion.getNombre().equals(nombre)){
                listaHabitaciones.remove(habitacion);
                System.out.println("Habitación " + nombre + " borrada con éxito.");
                return;
            }
        }

    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {
        System.out.println("Introduce el nombre del propietario de la casa en dirección " + direccion);
        String nombre = teclado.next();
        System.out.println("Edad: ");
        int edad = teclado.nextInt();
        teclado.nextLine();
        propietario = new Propietario(nombre,edad);
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

        System.out.println("Hay " + listaHabitaciones.size() + " habitaciones de la casa de " + propietario.getNombre() + " en la dirección " + direccion);

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
                "propietario='" + propietario +
                '}';
    }


}
