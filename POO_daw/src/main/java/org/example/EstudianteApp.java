package org.example;

public class EstudianteApp {

    static void main() {

        Estudiante ivan = new Estudiante("Iván","1DAW","alumno@mutxamel.com");

        System.out.println(ivan.getNia());

        Estudiante alejandro = new Estudiante("alejandro");

        System.out.println(alejandro.getNia());

        System.out.println("Estudiantes creados: " + Estudiante.obtenerTotalEstudiantes());

        System.out.println(Estudiante.validarCorreo("hola@iesmutxamel.com"));
        System.out.println(Estudiante.validarCorreo("hola@alu.edu.gva.es"));

    }
}
