package conjuntos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio1 {

    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe una frase:");
        String frase = teclado.nextLine().toLowerCase();

        String fraseVector[]= frase.split(" ");

        HashSet<String>frasesindu = new HashSet<>(Arrays.asList(fraseVector));

        System.out.println("Frase normal " + frase);
        System.out.println("Frase sin duplicados " + frasesindu);









    }
}
