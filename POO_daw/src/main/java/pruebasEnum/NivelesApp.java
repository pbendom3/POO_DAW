package pruebasEnum;

import java.util.Random;
import java.util.Scanner;

public class NivelesApp {
    static void main() {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Que dificultad vas a querer?");
        String dificultad = teclado.next();

        NivelesDif dificultad1 = NivelesDif.valueOf(dificultad);

        int puntuacion = aleatorio.nextInt(4000)+1;
        System.out.println(puntuacion);

        System.out.println(puntuacion*dificultad1.getMultiplicador());







    }
}
