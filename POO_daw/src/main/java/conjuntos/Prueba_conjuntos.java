package conjuntos;

import java.util.*;

public class Prueba_conjuntos {

    static void main() {

        String peces[] = {"boquerones","sardinas","anchoas","anchoas","tiburon","merluza","merluza","anguila"};

        HashSet<String> desordenada = new HashSet<>(Arrays.asList(peces));
        LinkedHashSet<String> respeta_orden = new LinkedHashSet<>(Arrays.asList(peces));
        TreeSet<String> ordenado = new TreeSet<>(Arrays.asList(peces));

        System.out.println(desordenada);
        System.out.println(respeta_orden);
        System.out.println(ordenado);








    }


}
