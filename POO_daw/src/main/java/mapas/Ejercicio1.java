package mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine().toLowerCase();

        HashMap<String,Integer> mapa = new HashMap<>();

        for (String palabra : frase.split(" ")){

//            if (mapa.containsKey(palabra)){
//                mapa.put(palabra,mapa.get(palabra)+1);
//            }else{
//                mapa.put(palabra,1);
//            }

            mapa.put(palabra,mapa.getOrDefault(palabra,0)+1);

        }

        for (Map.Entry<String,Integer> mapita : mapa.entrySet()){

            System.out.println(mapita.getKey() + ": " + mapita.getValue());

        }




    }
}
