package Guia_3.Parte_6.Intro;

import java.util.Scanner;

public class RegistroEstudiantes {
    private Estudiante[] estudiantes;
    private int cantidadEstudiantes;

    public RegistroEstudiantes(int cantidadMaximaEstudiantes) {
        this.estudiantes = new Estudiante[cantidadMaximaEstudiantes];
        this.cantidadEstudiantes = 0;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (cantidadEstudiantes < estudiantes.length) {
            estudiantes[cantidadEstudiantes] = estudiante;
            cantidadEstudiantes++;
        } else {
            System.out.println("No se pueden agregar más estudiantes");
        }
    }

    public void agregarEstudiantePorConsola() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el edad del estudiante:");
        int edad = scanner.nextInt();
        System.out.println("Ingrese el número de promedio del estudiante:");
        double promedio = scanner.nextInt();
        Estudiante estudiante = new Estudiante(nombre, edad, promedio);
        agregarEstudiante(estudiante);
    }
}
