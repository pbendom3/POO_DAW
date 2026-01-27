import java.util.ArrayList;
import java.util.Arrays;

public class PruebaArrList {

    static void main() {

        ArrayList<String> listaPartesCoche = new ArrayList<>();

        System.out.println("Elementos insertados: " + listaPartesCoche.size());

        listaPartesCoche.add("puerta");
        listaPartesCoche.add("polea");
        listaPartesCoche.add("piston");
        listaPartesCoche.add("alternador");

        System.out.println("Elementos insertados: " + listaPartesCoche.size());

        listaPartesCoche.add(3,"tubo escape");

        System.out.println(listaPartesCoche);

        listaPartesCoche.remove("puerta");

        System.out.println(listaPartesCoche);

        listaPartesCoche.remove(1);

        System.out.println(listaPartesCoche);

        System.out.println("Posición de alternador en la lista: " + listaPartesCoche.indexOf("alternador"));
        System.out.println("Posición de puerta en la lista: " + listaPartesCoche.indexOf("puerta"));

        System.out.println("En la posición 2 está: " + listaPartesCoche.get(2));

        for (String parte : listaPartesCoche){
            System.out.println("Parte: " + parte);
        }

        for (int i = 0; i < listaPartesCoche.size(); i++) {
            System.out.println("Parte " + (i+1) + ": " + listaPartesCoche.get(i));
        }

        listaPartesCoche.set(0,"carter");

        System.out.println(listaPartesCoche);

        /// / !!!!! CUIDAO
        Object no_clonar = listaPartesCoche.clone();

        ArrayList<String> copia = new ArrayList<>(listaPartesCoche);

        System.out.println("La lista contiene puerta?: " + listaPartesCoche.contains("puerta"));
        System.out.println("La lista contiene alternador?: " + listaPartesCoche.contains("alternador"));

        System.out.println("Está vacía? " + listaPartesCoche.isEmpty());

        listaPartesCoche.clear();

        System.out.println("Está vacía? " + listaPartesCoche.isEmpty());

        listaPartesCoche.addAll(Arrays.asList("rueda","freno","radiador"));

        System.out.println(listaPartesCoche);

    }
}
