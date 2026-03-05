package colecciones;

import java.util.Stack;

public class Ejercicio2 {

    static void main() {

        Stack<Integer> pila = new Stack<>();

        pila.push(5);
        pila.push(8);
        pila.push(10);

        while(!pila.isEmpty()){
            System.out.println(pila.pop());
        }

    }
}
