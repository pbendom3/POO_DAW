package org.example;

public class PersonaApp {

    static void main() {

        Persona profe = new Persona("patricia","1000000A",50);
        System.out.println(profe.getEdad());

        Persona alum = new Persona();
        System.out.println(alum.getDni());
        alum.setDni("2000000X");
        System.out.println(alum.getDni());



    }
}
