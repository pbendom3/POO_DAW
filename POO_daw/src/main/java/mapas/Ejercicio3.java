package mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3 {

    static HashMap<String,Double> mapa = new HashMap<>();
    static Scanner teclado = new Scanner(System.in);

    static void main() {

        System.out.println("*** REGISTRO DE TEMPERATURAS ***");

        while(true){

            System.out.println("Elige una opción [insertar, actualizar, consultar, ver todas, salir]: ");
            String opcion = teclado.next().toLowerCase();

            teclado.nextLine();

            switch(opcion){
                case "insertar":
                    insertar();
                    break;
                case "actualizar":
                    actualizar();
                    break;
                case "consultar":
                    consultar();
                    break;
                case "ver todas":
                    verTodas();
                    break;
                case "salir":
                    return;
                default:
                    System.out.println("La opción no existe. Elige otra...");
            }

        }

    }

    public static void insertar(){

        System.out.println("Introduce los nuevos datos (ciudad/temperatura): ");
        String datos[] = teclado.nextLine().split("/");

        mapa.put(datos[0],Double.valueOf(datos[1]));

    }

    public static void actualizar(){

        System.out.println("Introduce la ciudad a actualizar: ");
        String ciudad = teclado.nextLine();

        if (mapa.containsKey(ciudad)){
            System.out.println("Introduce la nueva temperatura: ");
            Double temp = teclado.nextDouble();
            mapa.put(ciudad,temp);
        }else{
            System.out.println("La ciudad no existe. Actualización cancelada.");
        }

    }

    public static void consultar(){

    }

    public static void verTodas(){

        for (Map.Entry<String,Double> mapita : mapa.entrySet()){
            System.out.println(mapita.getKey() + " --> " + mapita.getValue() + "º");
        }

    }

}
