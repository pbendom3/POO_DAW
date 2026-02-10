package restaurante;

import java.util.ArrayList;

public class BarPacoApp {

    static void main() {

        Camarero pepe = new Camarero("Pepe","3231222J",1234.89);

        pepe.mostrarInfoPersona();

        Cliente jose = new Cliente("Jose", "12345678A", 5, 7);

        jose.mostrarInfoPersona();

        Encargado izan = new Encargado("Izan","1266372V",30000);

        izan.mostrarInfoPersona();

        Persona patri = new Encargado("Patricia","12222345V",60000);
        System.out.println("VA LA INFO DE LA HIJA");
        patri.mostrarInfoPersona();

        ArrayList<Persona> listaPersonal = new ArrayList<>();

        listaPersonal.add(patri);
        listaPersonal.add(izan);

        entrarBar(izan);
        entrarBar(patri);
        entrarBar(pepe);

    }

    public static void entrarBar(Persona persona){

        System.out.println("Holaa");

    }
}
