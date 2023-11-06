package Guia_3.Parte_6.Intro;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Guia_3.Parte_6.Intro.Exceptions.EdadInvalidaException;
import Guia_3.Parte_6.Intro.Exceptions.NombreInvalidoException;
import Guia_3.Parte_6.Intro.Exceptions.PromedioInvalidoException;


public class main {

    
    public static void main(String[] args) throws NombreInvalidoException, EdadInvalidaException, PromedioInvalidoException {

        ArrayList<Estudiante> registro = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Ingrese el nombre del estudiante: ");
                String nombre = scanner.nextLine();

                System.out.print("Ingrese la edad del estudiante: ");
                int edad = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Ingrese el promedio del estudiante: ");
                double promedio = scanner.nextDouble();
                scanner.nextLine();

                Estudiante estudiante = new Estudiante(nombre, edad, promedio);
                registro.add(estudiante);

                System.out.println("Estudiante agregado al registro.");
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingreso inválido. Intente nuevamente.");
                scanner.nextLine();
            }
        }
    }
}
