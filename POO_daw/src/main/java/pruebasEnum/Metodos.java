package pruebasEnum;

import java.util.Scanner;

public class Metodos {

    static void main() {


        Scanner teclado = new Scanner(System.in);

        Metodo opcion = Metodo.PAYPAL;

        System.out.println(opcion);

        System.out.println("Métodos válidos: ");
        for (Metodo metodo : Metodo.values()){
            System.out.println(metodo);
        }

        System.out.println(opcion.ordinal());
        System.out.println(opcion.name());
        System.out.println("Comisión para el método " + opcion + ": " + opcion.getComision());

        System.out.println("Elige un método de pago: ");
        Metodo respuesta = Metodo.valueOf(teclado.next().toUpperCase());
        System.out.println("Método elegido: " + respuesta);

    }
}
