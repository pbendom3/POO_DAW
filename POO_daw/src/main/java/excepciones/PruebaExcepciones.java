package excepciones;

import java.util.HashMap;
import java.util.zip.DataFormatException;

public class PruebaExcepciones {

    static void main(){

        int cuenta = -5;

        try{
            if (cuenta <=0) {
                throw new CuentaSaldoNegativo();
            }
        }catch (CuentaSaldoNegativo e){
            System.out.println(e.getMessage());
        }

        HashMap<String,Integer> mapa = new HashMap<>();

        mapa.put("OLIVAS",7);
        mapa.put("PERAS",2);




    }
}
