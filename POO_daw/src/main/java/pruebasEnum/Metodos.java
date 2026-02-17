package pruebasEnum;

public class Metodos {

    static void main() {

        Metodo opcion = Metodo.PAYPAL;

        System.out.println(opcion);

        System.out.println("Métodos válidos: ");
        for (Metodo metodo : Metodo.values()){
            System.out.println(metodo);
        }

        System.out.println(opcion.ordinal());
        System.out.println(opcion.name());
        System.out.println("Comisión para el método " + opcion + ": " + opcion.getComision());


    }
}
