package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Perro perro1 = new Perro("caniche","permanente",1,4,"verde");

        Perro perro2 = new Perro();

        perro1.imprimirFicha();

        perro2.setColor("negro");
        perro2.setRaza("pastor alemán");
        System.out.println(perro2.getColor());


    }
}
