package comparadores;

import java.util.*;

public class CompraIvanApp {

    static void main() {

        List<Portatil> portatiles = new LinkedList<>();
        portatiles.add(new Portatil("MacBook Air",64,1.2));
        portatiles.add(new Portatil("MacBook PRO",128,1.55));
        portatiles.add(new Portatil("HP Pavilion", 64,4.0));

        Collections.sort(portatiles);

        System.out.println(portatiles);

        TreeMap<Portatil,String> mapa = new TreeMap<>(Comparator.reverseOrder());

        List<Map.Entry<Portatil,String>> listaMapa = new ArrayList<>(mapa.entrySet());

        listaMapa.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        Prueba prueba = new Prueba(Arrays.asList("Adios","Paco"));

        prueba.getListaIndestructible().add("Juan");

    }

}
