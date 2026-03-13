package iteradores;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mapas_it {

    static void main() {

        HashMap<String,Integer> goleadores = new HashMap<>();
        goleadores.put("ANDRÉ SILVA",6);
        goleadores.put("RONALDO NAZARIO",156);

        Iterator<Map.Entry<String,Integer>> itmapita = goleadores.entrySet().iterator();

        while(itmapita.hasNext()){

            Map.Entry<String,Integer> goleadorGol = itmapita.next();

            System.out.println(goleadorGol.getKey() + " ha marcado " + goleadorGol.getValue() + " goles.");

            if (goleadorGol.getValue()<100){
                itmapita.remove();
            }

        }

        System.out.println(goleadores.entrySet());




    }
}
