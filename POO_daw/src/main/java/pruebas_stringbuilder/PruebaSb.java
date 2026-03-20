package pruebas_stringbuilder;

public class PruebaSb {

    static void main() {

        StringBuilder sb = new StringBuilder();

        sb.append("Es el vecino ");
        sb.append(" el que elige ").append(" al alcalde ");
        sb.insert(13, " alcalde");
        sb.replace(20,24," vecinos ");
        sb.delete(13,17);

        System.out.println(sb);
        sb.reverse();
        //Es el vecino lde el que vecinos elige al alcalde
        System.out.println(sb);





    }
}
