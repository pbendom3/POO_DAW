package restaurante;

import java.util.ArrayList;

public class Encargado extends Persona {

    private ArrayList<Camarero> listaCamareros;
    private double salario;

    public Encargado(String nombre, String dni, double salario) {
        super(nombre, dni);
        this.salario=salario;
        listaCamareros =  new ArrayList<>();
    }

    public ArrayList<Camarero> getListaCamareros() {
        return listaCamareros;
    }

    public void setListaCamareros(ArrayList<Camarero> listaCamareros) {
        this.listaCamareros = listaCamareros;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void echarBronca(){
        System.out.println("Sirve más rápido!!!!!!");
    }

    @Override
    public void mostrarInfoPersona(){
        super.mostrarInfoPersona();
        System.out.println("Encargado con salario: " + salario + "€");
        System.out.println("Camareros a cargo: ");
        for (Camarero camarero : listaCamareros){
            System.out.println(camarero.getNombre());
        }
    }


    @Override
    public String toString() {
        return "Encargado{" +
                "listaCamareros=" + listaCamareros +
                ", salario=" + salario +
                '}';
    }

}
