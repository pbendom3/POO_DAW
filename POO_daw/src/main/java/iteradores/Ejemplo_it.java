package iteradores;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ejemplo_it {

    static void main() {

        TreeSet<String> peliculas = new TreeSet();

        peliculas.add("SCREAM");
        peliculas.add("CARS");
        peliculas.add("TOY STORY");
        peliculas.add("BOLT");

        Iterator<String> it = peliculas.iterator();

        peliculas.remove("BOLT");

        while (it.hasNext()){

            String peli = it.next();

            if (peli.equals("BOLT")){
                it.remove();
            }

        }

        System.out.println(peliculas);

    }





}
