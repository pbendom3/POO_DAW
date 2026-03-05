package colecciones;

import java.util.Stack;

public class Ejercicio3 {
    static void main() {

        String expresion = ":IHGFJ";

        if (esBalanceado(expresion)){
            System.out.println("BIEN");
        }else{
            System.out.println("MAL");
        }

    }

    public static boolean esBalanceado(String expresion){

        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < expresion.length(); i++) {

            if (expresion.charAt(i)=='('){
                pila.push(expresion.charAt(i));
            } else if (expresion.charAt(i)==')') {
                if (pila.contains('(')){
                    pila.pop();
                }else{
                    return false;
                }
            }

        }

        if (pila.isEmpty()){
            return true;
        }else{
            return false;
        }


    }
}
