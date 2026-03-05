package colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ParentesisBalanceados {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext())
            return false;
        else {

            ArrayList<Character> lista_abiertos = new ArrayList<>(Arrays.asList('(','{','['));
            ArrayList<Character> lista_cerrados = new ArrayList<>(Arrays.asList(')','}',']'));
            Stack<Character> pila = new Stack<>();

            String expresion = in.nextLine();

            for (int i = 0; i < expresion.length(); i++) {

                if (lista_abiertos.contains(expresion.charAt(i))){
                    pila.push(expresion.charAt(i));
                } else if (lista_cerrados.contains(expresion.charAt(i))){
                    int pos = lista_cerrados.indexOf(expresion.charAt(i));
                    if (pila.contains(lista_abiertos.get(pos)) && pila.peek()==lista_abiertos.get(pos)){
                        pila.pop();
                    }else{
                        System.out.println("NO");
                        return true;
                    }
                }

            }

            if (pila.isEmpty()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main


}
