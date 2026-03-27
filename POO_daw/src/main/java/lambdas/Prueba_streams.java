package lambdas;

import java.util.List;
import java.util.stream.Stream;

public class Prueba_streams {

    static void main() {

       boolean pruebaStream = Stream.of("Gatos","Leones","Tigre","Guepardo")
                .filter(felino -> felino.endsWith("s"))
                .filter(felinos -> felinos.contains("e"))
                .map(String::toUpperCase)
                .anyMatch(felinos -> felinos.equals("JIRAFAS"));
            //    .count();

      //  List<String> felinos = pruebaStream.toList();
        System.out.println(pruebaStream);





    }
}
