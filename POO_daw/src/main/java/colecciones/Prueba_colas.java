package colecciones;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Prueba_colas {

    static void main() {

        Deque<String> cola = new LinkedList<>();

        cola.poll();

        cola.offer("Manolito");
        cola.offer("Pocoyó");
        cola.offer("Bart Simpson");
        cola.offer("Stewie");
        cola.poll();
        System.out.println(cola.peek());
        cola.offerFirst("Kevin Mc Calister");
        System.out.println(cola.peek());
        cola.pollLast();
        System.out.println(cola.peekLast());

        LinkedBlockingQueue<String> cola_limitada = new LinkedBlockingQueue<>(3);
        cola_limitada.offer("Manolito");
        cola_limitada.offer("Juanito");
        cola_limitada.offer("Jaimito");
        cola_limitada.offer("Joselito");
        System.out.println(cola_limitada);




    }
}
