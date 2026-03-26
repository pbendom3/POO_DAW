package lambdas;

public class Programa {

    static void main() {

        Prueba anonima = new Prueba() {
            @Override
            public char saludar(String nombre) {
                System.out.println("Hola " + nombre + " soy una anónima");
                return nombre.charAt(nombre.length()-1);
            }
        };

        Prueba lambda = (nombre) -> {
            System.out.println("Hola " +  nombre + " soy una lambda");
            int num = (nombre.length()-1)/2;
            return nombre.charAt(num);
        };

        System.out.println(anonima.saludar("Iván"));
        System.out.println(lambda.saludar("Ismael"));




    }
}
