package colecciones;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Palindromos {

    static void main() {

        Deque<Character> cola = new LinkedList<>();

        String palabra = "radar";

        for (int i = 0; i < palabra.length(); i++) {
            cola.offer(palabra.charAt(i));
        }

        while(!cola.isEmpty()){
            if (cola.peekFirst()==cola.peekLast()){
                cola.pollFirst();
                cola.pollLast();
            }else{
                System.out.println("No es palíndromo.");
                return;
            }
        }

        System.out.println("Es palíndromo");

    }
}
