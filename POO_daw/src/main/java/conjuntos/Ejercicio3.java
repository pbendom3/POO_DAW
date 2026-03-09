package conjuntos;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);


        LinkedHashSet<String>lista = new LinkedHashSet<>();
        String url = "";
        while (true){
            System.out.println("Escribe una URL visitada (o 'Salir' para terminar):");
            url = teclado.next().toLowerCase();
            if(url.equals("salir")){
                break;
            }
            lista.add(url);
        }

        int contador = 1;
        System.out.println("Historial de navegacion");
        for (String frase : lista){
            System.out.println(contador + " " + frase);
            contador++;
        }
    }
}
