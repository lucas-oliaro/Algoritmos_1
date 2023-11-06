package Guia_3.Parte_6.Intro;

import Guia_3.Parte_6.Intro.Exceptions.EdadInvalidaException;
import Guia_3.Parte_6.Intro.Exceptions.NombreInvalidoException;
import Guia_3.Parte_6.Intro.Exceptions.PromedioInvalidoException;


public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante(String nombre, int edad, double promedio) throws NombreInvalidoException, EdadInvalidaException, PromedioInvalidoException {
        if (nombre == null || nombre.isEmpty()){
            throw new NombreInvalidoException();
            }
       
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException();
        }
        if (promedio < 0.0 || promedio > 10.0) {
            throw new PromedioInvalidoException();
        }
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
